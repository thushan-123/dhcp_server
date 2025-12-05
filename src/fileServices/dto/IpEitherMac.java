package fileServices.dto;

import java.net.Inet4Address;

public class IpEitherMac {
    Inet4Address ip;
    String mac;

    public IpEitherMac() {}

    public IpEitherMac(Inet4Address ip) {}

    public IpEitherMac(String mac) {}

    public IpEitherMac(Inet4Address ip, String mac) {}

    public Inet4Address getIp() {
        return ip;
    }

    public void setIp(Inet4Address ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
