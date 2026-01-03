package dhcpServices;

import utility.IpRecord;

import java.net.Inet4Address;
import java.net.NetworkInterface;

public interface FileStorageService {

    public boolean storeMacAndIpv4 (IpRecord ipStorage);

    public IpRecord findByMac(NetworkInterface networkInterface);

    public IpRecord findByIpv4(Inet4Address inet4Address);
}
