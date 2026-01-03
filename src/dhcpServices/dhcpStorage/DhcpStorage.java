package dhcpServices.dhcpStorage;

import utility.IpPool;
import utility.IpRecord;

import java.net.Inet4Address;

public class DhcpStorage implements  DhcpStorageServices{
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

    }
}
