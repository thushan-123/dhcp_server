package dhcpMessage;

public class AckMessage {

    public final byte[] xid;
    public final byte[] clientMac;
    public final byte[] yiaddr;

    public AckMessage(byte[] xid, byte[] clientMac, byte[] yiaddr) {
        this.xid = xid;
        this.clientMac = clientMac;
        this.yiaddr = yiaddr;
    }

    public byte[] build (){
        byte op = 2;
        byte htype =1;
        byte hlen = 6;
        byte hops = 0;
        byte[] secs = {0x00, 0x00};
    }
}
