package ipPool.dhcpStorage;

import java.net.Inet4Address;
import java.net.NetworkInterface;

public interface FileStorageService {

    public boolean storeMacAndIpv4 (IpStorage ipStorage);

    public IpStorage findByMac(NetworkInterface networkInterface);

    public IpStorage findByIpv4(Inet4Address inet4Address);
}
