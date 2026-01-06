package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.util.*;

public class DhcpStorage implements  DhcpStorageServices {

    private List<IpPool> ipPool;

    private HashMap<UUID, IpRecord> ipRecords = new HashMap<>();

//    public DhcpStorage(IpPool ipPool) {
//        this.ipPool = ipPool;
//    }

    @Override
    public void setIpPool(IpPool ipPool) {
        this.ipPool.add(ipPool);

    }

    @Override
    public IpRecord generateIpRecord(UUID poolId ,NetworkInterface networkInterface) {

        return null;
    }



    @Override
    public IpRecord deleteIpRecord(Inet4Address inet4Address) {
        return null;
    }

    @Override
    public IpPool getIpPool(UUID poolId) {
        List<Object> data = ipPools.get(poolId);
        if (data == null) {
            return null;
        }

        return (IpPool) data.getFirst();
    }


}
