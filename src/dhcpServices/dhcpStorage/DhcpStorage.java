package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.util.*;

public class DhcpStorage implements  DhcpStorageServices {

    private HashMap<UUID, List<Object>> ipPools = new HashMap<>();

    @Override
    public void setIpPool(IpPool ipPool) {

        List<IpRecord> ipRecords = new ArrayList<>();
        List<Object> newPool = new ArrayList<>();
        newPool.add(ipPool);
        newPool.add(ipRecords);
        ipPools.put(ipPool.getPoolId(), newPool);
    }

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


}
