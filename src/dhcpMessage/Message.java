package dhcpMessage;

public class Message {
    byte op ;           // opcode   -> 1byte
    byte htype;         // htype    -> 1byte
    byte hlen;          // hlen     -> 1byte
    byte hops;          // hops     -> 1byte
    byte xid;           // xid      -> 4byte
    byte seces;         // seces    -> 2byte
    byte flags;         // flags    -> 2byte
    byte ciaddr;        // ciaddr   -> 4byte
    byte yiaddr;        // yiaddr   -> 4byte
    byte siaddr;        // siaddr   -> 4byte
    byte giaddr;        // giaddr   -> 4byte
    byte chaddr;        // chaddr   -> 16byte
    byte sname;         // sname    -> 64byte
    byte file;          // file     -> 128bytes
    byte optional;


    public Message(
            byte op,
            byte htype,
            byte hlen,
            byte hops,
            byte xid,
            byte seces,
            byte flags,
            byte ciaddr,
            byte yiaddr,
            byte siaddr,
            byte giaddr,
            byte chaddr,
            byte sname,
            byte file,
            byte optional
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
}
