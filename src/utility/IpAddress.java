package utility;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class IpAddress {

    public static Inet4Address incrementIp(
            Inet4Address ipAddress,
            Inet4Address subnetMask,
            List<Inet4Address> excludeIps
    ) {
        if (subnetMask == null || ipAddress == null || excludeIps == null) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        String ip = ipAddress.toString();
        String mask = subnetMask.toString();

        List<String> excludeIpString = new ArrayList<>();
        for (Inet4Address a : excludeIps) {
            excludeIpString.add(a.toString());
        }

        String[] octes = ip.split("\\.");   // split ip 4 octes
        if (octes.length != 4) {
            throw new IllegalArgumentException("Invalid IP address");
        }

        return null;
    }
}
