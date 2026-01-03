package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DhcpStorage implements  DhcpStorageServices{

    private HashMap<IpPool, List<IpRecord>> ipPools = new HashMap<IpPool, List<IpRecord>>();

    @Override
    public IpRecord generateIpRecord(IpRecord ipRecord) {
        return null;
    }

    @Override
    public IpRecord deleteIpRecord(Inet4Address inet4Address) {
        return null;
    }

    @Override
    public IpPool getIpPool() {
        return null;
    }

    @Override
    public void setIpPool(IpPool ipPool) {

        ipPools.put(ipPool, new ArrayList<>());
    }
}
