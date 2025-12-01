package dhcpMessage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Message {
    byte op ;           // opcode   -> 1byte
    byte htype;         // htype    -> 1byte
    byte hlen;          // hlen     -> 1byte
    byte hops;          // hops     -> 1byte
    byte[] xid;           // xid      -> 4byte
    byte[] seces;         // seces    -> 2byte
    byte[] flags;         // flags    -> 2byte
    byte[] ciaddr;        // ciaddr   -> 4byte
    byte[] yiaddr;        // yiaddr   -> 4byte
    byte[] siaddr;        // siaddr   -> 4byte
    byte[] giaddr;        // giaddr   -> 4byte
    byte[] chaddr;        // chaddr   -> 16byte
    byte[] sname;         // sname    -> 64byte
    byte[] file;          // file     -> 128bytes
    byte[] optional;

//  data[0] , data[1], data[2], data[3],
//  byte data array
//  data[4-8], data[8-10], data[10-12],
//  data[12-16], data[16-20], data[20-24], data[24-28], data[28-44], data[44-108], data[108-236]
    public Message(
            byte op,
            byte htype,
            byte hlen,
            byte hops,
            byte[] xid,
            byte[] seces,
            byte[] flags,
            byte[] ciaddr,
            byte[] yiaddr,
            byte[] siaddr,
            byte[] giaddr,
            byte[] chaddr,
            byte[] sname,
            byte[] file,
            byte[] optional
    ) {
        this.op = op;
        this.htype = htype;
        this.hlen = hlen;
        this.hops = hops;
        this.xid = xid;
        this.seces = seces;
        this.flags = flags;
        this.ciaddr = ciaddr;
        this.yiaddr = yiaddr;
        this.siaddr = siaddr;
        this.giaddr = giaddr;
        this.chaddr = chaddr;
        this.sname = sname;
        this.file = file;
        this.optional = optional;
    }

    public byte[] builtMessage() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        outputStream.write(op);
        outputStream.write(htype);
        outputStream.write(hlen);
        outputStream.write(hops);
        outputStream.write(xid);
        outputStream.write(seces);
        outputStream.write(flags);
        outputStream.write(ciaddr);
        outputStream.write(yiaddr);
        outputStream.write(siaddr);
        outputStream.write(giaddr);
        outputStream.write(chaddr);
        outputStream.write(sname);
        outputStream.write(file);
        outputStream.write(optional);

        return outputStream.toByteArray();
    }
}
