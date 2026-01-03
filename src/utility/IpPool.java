package utility;

import java.net.Inet4Address;
import java.util.UUID;

public class IpPool {

    UUID poolId;
    Inet4Address ipv4PoolStartIp;
    Inet4Address ipv4PoolEndIp;
    Inet4Address[] excludeIps;
    Inet4Address networkIp;
    Inet4Address subnetMask;

    public IpPool (
            Inet4Address networkIp,
            Inet4Address subnetMask,
            Inet4Address ipv4PoolStartIp,
            Inet4Address ipv4PoolEndIp,
            Inet4Address[] excludeIps
    ){
        this.networkIp = networkIp;
        this.subnetMask = subnetMask;
        this.ipv4PoolStartIp = ipv4PoolStartIp;
        this.ipv4PoolEndIp = ipv4PoolEndIp;
        this.excludeIps = excludeIps;
        this.poolId = UUID.randomUUID();
    }
}
