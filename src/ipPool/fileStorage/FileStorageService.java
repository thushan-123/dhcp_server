package ipPool.fileStorage;

import java.net.Inet4Address;
import java.net.NetworkInterface;

public interface FileStorageService {

    public boolean storeMacAndIpv4 (NetworkInterface networkInterface, Inet4Address ipv4Address);

    public IpStorage findByMac
}
