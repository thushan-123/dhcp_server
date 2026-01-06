package utility;

import java.net.Inet4Address;
import java.util.List;

public class IpAddress {

    public static Inet4Address incrementIp(
            Inet4Address address,
            Inet4Address subnetMask,
            List<Inet4Address> excludeIps
    ) {
        if (subnetMask == null || address == null || excludeIps == null) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        return null;
    }
}
