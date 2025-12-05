package fileServices.dto;

import java.net.Inet4Address;

public class IpEitherMac {
    Inet4Address ip;
    String mac;

    public IpEitherMac(Inet4Address ip) {}

    public IpEitherMac(String mac) {}

    public IpEitherMac(Inet4Address ip, String mac) {}

}
