public class GrabDhcpDiscover {

    private final byte[] dhcpDiscoverMessage;

    private byte[] xid ;
    private byte[] clientMac;

    public GrabDhcpDiscover(byte[] dhcpDiscoverMessage) {
        this.dhcpDiscoverMessage = dhcpDiscoverMessage;
        xid = new byte[4];
        clientMac = new byte[6];
        System.arraycopy(dhcpDiscoverMessage, 4, xid, 0, 4);
        System.arraycopy(dhcpDiscoverMessage, 0, clientMac, 0, 6);
    }

    public byte[] getClientMac() {
        return clientMac;
    }

    public void setClientMac(byte[] clientMac) {
        this.clientMac = clientMac;
    }

    public byte[] getXid() {
        return xid;
    }

    public void setXid(byte[] xid) {
        this.xid = xid;
    }
}
