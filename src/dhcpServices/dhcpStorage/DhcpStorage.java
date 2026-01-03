package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.util.*;

public class DhcpStorage<T> implements  DhcpStorageServices {

    private HashMap<UUID, List<T>> ipPools = new HashMap<>();

    @Override
    public IpRecord generateIpRecord(IpRecord ipRecord) {
        return null;
    }

    @Override
    public IpRecord deleteIpRecord(Inet4Address inet4Address) {
        return null;
    }

    @Override
    public IpPool getIpPool(UUID poolId) {
       return null;
    }

    @Override
    public void setIpPool(IpPool ipPool) {

    }
}
