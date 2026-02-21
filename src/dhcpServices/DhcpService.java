package dhcpServices;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.util.List;

public class DhcpService {

    /*
    IpRecord attributes

        networkInterface;
        inet4AddressAssign;
        leaseTime;

    IpPool attributes

        ipv4PoolStartIp;
        ipv4PoolEndIp;
        excludeIps;
        networkIp;
        subnetMask;
    */

    private List<IpRecord> ipRecords;
    private final IpPool ipPool;

    public DhcpService(IpPool ipPool) {
        this.ipPool = ipPool;
    }

    public IpRecord getIp() {
        String startIp = ipPool.getIpv4PoolStartIp().toString();
        String endIp = ipPool.getIpv4PoolEndIp().toString();
        String subnetMask = ipPool.getSubnetMask().toString();

        // generate the ip between start ip and end ip
        return null;
    }

    public boolean deleteIp(IpRecord ipRecord) {
        return false;
    }
}
