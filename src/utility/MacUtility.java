package utility;

import logger.LogStatus;
import logger.Logger;

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

    public String bytesToMac(byte[] macBytes) {
        if (macBytes.length != 6) {
            Logger.getInstance().log(LogStatus.ERROR, "Mac Length Error");
            throw new IllegalArgumentException("Mac Length Error");
        }
        StringBuilder sb = new StringBuilder();
        for (byte macByte : macBytes) {
            sb.append(macByte);
        }

        return sb.toString();
    }
}

