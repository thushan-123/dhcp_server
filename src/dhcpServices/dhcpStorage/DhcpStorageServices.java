package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.UUID;

public interface DhcpStorageServices {


    public IpRecord generateIpRecord( UUID poolId ,NetworkInterface networkInterface) throws UnknownHostException;

    public IpRecord deleteIpRecord(UUID poolId, Inet4Address inet4Address);
//    public IpRecord deleteIpRecordWithIp(Inet4Address inet4Address);

    public IpPool getIpPool(UUID poolId);

    public void setIpPool(IpPool ipPool);

}
