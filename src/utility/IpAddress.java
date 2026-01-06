package utility;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class IpAddress {

    public static Inet4Address incrementIp(
            Inet4Address startIp,
            Inet4Address subnetMask,
            List<Inet4Address> excludeIps
    ) throws UnknownHostException {
        if (subnetMask == null || startIp == null || excludeIps == null) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        String ip = startIp.toString();
        String mask = subnetMask.toString();

        List<String> excludeIpString = new ArrayList<>();
        for (Inet4Address a : excludeIps) {
            excludeIpString.add(a.toString());
        }

        String[] octes = ip.split("\\.");   // split ip 4 octes
        if (octes.length != 4) {
            throw new IllegalArgumentException("Invalid IP address");
        }

        octes[3] = String.valueOf((Integer.parseInt(octes[3]) + 1));
        return (Inet4Address) Inet4Address.getByName(octes[1] +"." +octes[1]+ "."+octes[2]+ "."+ octes[3]);
    }
}
