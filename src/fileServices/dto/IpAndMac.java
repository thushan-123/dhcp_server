package fileServices.dto;

import enums.IpStatus;

import java.net.Inet4Address;

public class IpAndMac {
    private Inet4Address ip;
    private String mac;
    private IpStatus status;

    public IpAndMac() {}

    public IpAndMac(Inet4Address ip) {
        this.ip = ip;
    }

    public IpAndMac(String mac) {
        this.mac = mac;
    }

    public IpAndMac(Inet4Address ip, String mac) {
        this.ip = ip;
        this.mac = mac;
    }

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

    public IpStatus getStatus() {
        return status;
    }

    public void setStatus(IpStatus status) {
        this.status = status;
    }
}
