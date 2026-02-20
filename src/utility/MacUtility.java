package utility;

import javax.crypto.Mac;

public class MacUtility {

    public byte[] macToBytes(String mac) {
        String[] strParts = mac.split(":");

        byte[] macBytes = new byte[6];

        for (int i = 0; i < strParts.length; i++) {
            macBytes[i] = (byte) Integer.parseInt(strParts[i], 16);
        }
        return macBytes;
    }
}

