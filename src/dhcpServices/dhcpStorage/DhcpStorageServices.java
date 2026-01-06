package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.util.UUID;

public interface DhcpStorageServices {


    public IpRecord generateIpRecord( UUID poolId ,NetworkInterface networkInterface);

    public IpRecord deleteIpRecord(Inet4Address inet4Address);

    public IpPool getIpPool(UUID poolId);

    public void setIpPool(IpPool ipPool);

}
