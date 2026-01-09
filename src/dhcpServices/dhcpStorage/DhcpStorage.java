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



    @Override
    public void setIpPool(IpPool ipPool) {
        this.ipPools.put(ipPool.getPoolId(), ipPool);

    }

    @Override
    public IpRecord generateIpRecord(UUID poolId ,NetworkInterface networkInterface) throws UnknownHostException {
        // check poolIp exists

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime tomorrowDateTime = currentDateTime.plusDays(1);

        IpPool ipPool = ipPools.get(poolId);
        if (ipPool == null) {
            throw new IllegalArgumentException("Pool " + poolId + " not found");
        }

        // get current using ips
        List<IpRecord> records = ipRecords.get(poolId);

        // add ips in inet4 array
        List<Inet4Address> excludeIps = new ArrayList<>();
        for (IpRecord ipRecord : records) {
            excludeIps.add(ipRecord.getInet4AddressAssign());
        }
        excludeIps.addAll(ipPool.getExcludeIps());

        Inet4Address newIp = IpAddress.incrementIp(
                ipPool.getIpv4PoolStartIp(),
                ipPool.getSubnetMask(),
                excludeIps
        );

        // new ip add to list and update hashmap
        IpRecord newIpRecord = new IpRecord(networkInterface, newIp, tomorrowDateTime);
        records.add(newIpRecord);

        ipRecords.put(poolId, records);

        return newIpRecord;
        //return null;
    }

    @Override
    public boolean deleteIpRecord(UUID poolId, Inet4Address inet4Address) {
        // get the list of ipRecord in ipRecodes hashmap
        List<IpRecord> records = ipRecords.get(poolId);
        records.removeIf(ipRecord -> ipRecord.getInet4AddressAssign().equals(inet4Address));
        // save new record
        ipRecords.put(poolId, records);
        return true;
    }


    @Override
    public IpPool getIpPool(UUID poolId) {

        // find the ip pool use in poolId and return
        return ipPools.get(poolId);
    }


}
