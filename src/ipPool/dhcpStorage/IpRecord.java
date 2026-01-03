package ipPool.dhcpStorage;

import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.time.LocalDateTime;

public class IpRecord {
    NetworkInterface networkInterface;
    Inet4Address inet4AddressAssign;
    LocalDateTime leaseTime;

    public IpRecord() {}

    public Inet4Address getInet4AddressAssign() {
        return inet4AddressAssign;
    }

    public void setInet4AddressAssign(Inet4Address inet4AddressAssign) {
        this.inet4AddressAssign = inet4AddressAssign;
    }

    public NetworkInterface getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
    }

    public LocalDateTime getLeaseTime() {
        return leaseTime;
    }

    public void setLeaseTime(LocalDateTime leaseTime) {
        this.leaseTime = leaseTime;
    }
}
