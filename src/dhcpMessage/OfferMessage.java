package dhcpMessage;

import java.io.IOException;

public class OfferMessage {
//    public final Message message;
//
//    public OfferMessage(Message message) {
//        this.message = message;
//    }

    public byte [] build ( byte[] xid, byte[] clientMac, byte[] yiaddrOffered ) throws IOException {
        byte op = 2 ;
        byte htype = 1;
        byte hlen = 6;
        byte hops = 0;
        byte[] seces = {0x00, 0x00};
        byte[] flags = {0x00, 0x00};
        byte[] ciaddr = new byte[4];
        byte[] siaddr = {(byte)127, (byte)0, (byte)0, (byte)1};

        byte[] giaddr = new byte[4];
        byte[] chaddr = new byte[16];
        System.arraycopy(clientMac, 0, chaddr,0, clientMac.length);
        byte[] sname = new byte[64];
        byte[] file = new byte[128];

        byte[] options = new byte[] {
                // Magic cookie
                0x63, (byte)0x82, 0x53, 0x63,

                // DHCP Message Type (OFFER = 2)
                53, 1, 2,

                // Subnet mask 255.255.255.0
                1, 4, (byte)255, (byte)255, (byte)255, 0,

                //default gateway -> 192.168.1.1
                3, 4, (byte)192, (byte)168, 1, 1,

                //lease time -> 1 hour
                51, 4, 0x00, 0x00, 0x0E, 0x10,

                // server identifier 192.168.1.1
                54, 4, (byte)127, (byte)0, (byte)0,(byte) 1,

                //end
                (byte)255
        };

        return new Message(
                op,
                htype,
                hlen,
                hops,
                xid,
                seces,
                flags,
                ciaddr,
                yiaddrOffered,
                siaddr,
                giaddr,
                chaddr,
                sname,
                file,
                options
        ).builtMessage();
    }
}
