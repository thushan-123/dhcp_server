package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;

public interface DhcpStorageServices {


    public IpRecord generateIpRecord(IpRecord ipRecord);

    public IpRecord deleteIpRecord(Inet4Address inet4Address);

    public IpPool getIpPool();

    public void setIpPool(IpPool ipPool);

}
