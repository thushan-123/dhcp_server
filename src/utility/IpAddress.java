package utility;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IpAddress {

    public static Inet4Address incrementIp(
            Inet4Address startIp,
            Inet4Address subnetMask,
            List<Inet4Address> excludeIps
    ) throws UnknownHostException {

        if (startIp == null || subnetMask == null || excludeIps == null) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        int startIpInt = inetToInt(startIp);
        int maskInt = inetToInt(subnetMask);

        int network = startIpInt & maskInt;
        int broadcast = network | ~maskInt;

        //excluded IP
        Set<Integer> excluded = new HashSet<>();
        for (Inet4Address ip : excludeIps) {
            excluded.add(inetToInt(ip));
        }

        // start from next IP
        for (int candidate = startIpInt + 1; candidate < broadcast; candidate++) {

            // Skip network & broadcast
            if (candidate == network || candidate == broadcast) {
                continue;
            }

            if (!excluded.contains(candidate)) {
                return intToInet(candidate);
            }
        }

        throw new IllegalStateException("No available IP in subnet");
    }


    private static int inetToInt(Inet4Address ip) {
        byte[] bytes = ip.getAddress();
        return ((bytes[0] & 0xFF) << 24)
                | ((bytes[1] & 0xFF) << 16)
                | ((bytes[2] & 0xFF) << 8)
                | (bytes[3] & 0xFF);
    }

    private static Inet4Address intToInet(int value) throws UnknownHostException {
        byte[] bytes = new byte[] {
                (byte) (value >>> 24),
                (byte) (value >>> 16),
                (byte) (value >>> 8),
                (byte) value
        };
        return (Inet4Address) InetAddress.getByAddress(bytes);
    }
}
