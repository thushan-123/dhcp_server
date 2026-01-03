package dhcpServices;

import utility.IpPool;
import utility.IpRecord;

import java.util.List;

public class DhcpStorage {

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

    public DhcpStorage(IpPool ipPool) {
        this.ipPool = ipPool;
    }

    public IpRecord getIpRecord() {

        // generate the ip between start ip and end ip
        return null;
    }
}
