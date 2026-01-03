package ipPool.dhcpStorage;

import ipPool.IpPool;

import java.util.List;

public class DhcpStorage {

    private List<IpRecord> ipRecords;
    private final IpPool ipPool;

    public DhcpStorage(IpPool ipPool) {
        this.ipPool = ipPool;
    }
}
