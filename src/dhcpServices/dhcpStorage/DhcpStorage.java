package dhcpServices.dhcpStorage;

import utility.IpAddress;
import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.*;

public class DhcpStorage implements  DhcpStorageServices {

    private HashMap<UUID, IpPool> ipPools = new HashMap<>();

    private HashMap<UUID, List<IpRecord>> ipRecords = new HashMap<>();

//    public DhcpStorage(IpPool ipPool) {
//        this.ipPool = ipPool;
//    }

    @Override
    public void setIpPool(IpPool ipPool) {
        this.ipPools.put(ipPool.getPoolId(), ipPool);

    }

    @Override
    public IpRecord generateIpRecord(UUID poolId ,NetworkInterface networkInterface) throws UnknownHostException {
        // check poolIp exists

//        LocalDateTime currentDateTime = LocalDateTime.now();
//        LocalDateTime tomorrowDateTime = currentDateTime.plusDays(1);

        IpPool ipPool = ipPools.get(poolId);
        if (ipPool == null) {
            throw new IllegalArgumentException("Pool " + poolId + " not found");
        }
        Inet4Address newIp = IpAddress.incrementIp(
                ipPool.getIpv4PoolStartIp(),
                ipPool.getSubnetMask(),
                List.of(ipPool.getExcludeIps())
        );

        List<IpRecord> records = ipRecords.get(poolId);

//        return new IpRecord(
//                networkInterface,
//                newIp,
//                ipPool
//
//        );
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
