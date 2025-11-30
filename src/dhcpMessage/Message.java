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
    byte optionsl


    public Message() {
    }
}
