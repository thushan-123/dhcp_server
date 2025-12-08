package fileServices.dto;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;

public class FileData {
    private String poolId;
    private String poolName;
    private Inet4Address defaultGateway;
    private Inet4Address dns;
    private Inet4Address subnetMask;
    private Inet4Address networkIp;
    private int numberOfIp;
    private List<HashMap<String, String>> ips;

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

    public Inet4Address getNetworkIp() {
        return networkIp;
    }

    public void setNetworkIp(Inet4Address networkIp) {
        this.networkIp = networkIp;
    }

    public int getNumberOfIp() {
        return numberOfIp;
    }

    public void setNumberOfIp(int numberOfIp) {
        this.numberOfIp = numberOfIp;
    }

    public List<HashMap<String, String>> getIps() {
        return ips;
    }

    public void setIps(List<HashMap<String, String>> ips) {
        this.ips = ips;
    }
}


//# ip-pool  <pool-id> <pool-name> <network-ip> <subnet-mask> <start-pool-line-number> <number-of-ips>
//        # default-gateway 192.168.1.1
//        # dns 8.8.8.8
//
//        # ip sub_pool <sub-pool-id> <size>      // line number 5  size 10  (next-sub-pool-line 17 (start-line + (sub-pool-id * size) +2) 5 + (10 * 1) + 2 = 17
//ff:56:55:55:34:aa:12  192.168.1.100  5  assign// <mac-address> <ip> <lease-time> <assign or available>
//ff:56:55:55:34:aa:12  192.168.1.101  5  assign