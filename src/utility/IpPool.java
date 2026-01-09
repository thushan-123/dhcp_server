package utility;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

public class IpPool {

    private UUID poolId;
    private Inet4Address ipv4PoolStartIp;
    private Inet4Address ipv4PoolEndIp;
    private Inet4Address[] excludeIps;
    private Inet4Address networkIp;
    private Inet4Address subnetMask;

    public IpPool (
            Inet4Address networkIp,
            Inet4Address subnetMask,
            Inet4Address ipv4PoolStartIp,
            Inet4Address ipv4PoolEndIp,
            Inet4Address[] excludeIps
    ){
        this.poolId = UUID.randomUUID();
        this.networkIp = networkIp;
        this.subnetMask = subnetMask;
        this.ipv4PoolStartIp = ipv4PoolStartIp;
        this.ipv4PoolEndIp = ipv4PoolEndIp;
        this.excludeIps = excludeIps;
        this.poolId = UUID.randomUUID();
    }

    public UUID getPoolId() {
        return poolId;
    }

//    public void setPoolId(UUID poolId) {
//        this.poolId = poolId;
//    }

    public Inet4Address getIpv4PoolStartIp() {
        return ipv4PoolStartIp;
    }

    public void setIpv4PoolStartIp(Inet4Address ipv4PoolStartIp) {
        this.ipv4PoolStartIp = ipv4PoolStartIp;
    }

    public Inet4Address getIpv4PoolEndIp() {
        return ipv4PoolEndIp;
    }

    public void setIpv4PoolEndIp(Inet4Address ipv4PoolEndIp) {
        this.ipv4PoolEndIp = ipv4PoolEndIp;
    }

    public void setPoolId(UUID poolId) {
        this.poolId = poolId;
    }

    public void setExcludeIps(Inet4Address[] excludeIps) {
        this.excludeIps = excludeIps;
    }

    public Inet4Address getNetworkIp() {
        return networkIp;
    }

    public void setNetworkIp(Inet4Address networkIp) {
        this.networkIp = networkIp;
    }

    public Inet4Address getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(Inet4Address subnetMask) {
        this.subnetMask = subnetMask;
    }

    public Collection<Inet4Address> getExcludeIps() {
        return Arrays.asList(excludeIps);
    }
}
