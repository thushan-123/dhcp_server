package fileServices.dto;

import java.net.Inet4Address;

public class Headers {
    private String poolId;
    private String poolName;
    private Inet4Address defaultGateway;
    private Inet4Address dns;
    private Inet4Address subnetMask;
    private Inet4Address networkIp;
    private int numberOfIp;

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public Inet4Address getDefaultGateway() {
        return defaultGateway;
    }

    public void setDefaultGateway(Inet4Address defaultGateway) {
        this.defaultGateway = defaultGateway;
    }

    public Inet4Address getDns() {
        return dns;
    }

    public void setDns(Inet4Address dns) {
        this.dns = dns;
    }

    public Inet4Address getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(Inet4Address subnetMask) {
        this.subnetMask = subnetMask;
    }

    public int getNumberOfIp() {
        return numberOfIp;
    }

    public void setNumberOfIp(int numberOfIp) {
        this.numberOfIp = numberOfIp;
    }

    public Inet4Address getNetworkIp() {
        return networkIp;
    }

    public void setNetworkIp(Inet4Address networkIp) {
        this.networkIp = networkIp;
    }
}

//
//# ip-pool  <pool-id> <pool-name> <network-ip> <subnet-mask> <start-pool-line-number> <number-of-ips>
//        # default-gateway 192.168.1.1
//        # dns 8.8.8.8