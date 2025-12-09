import dhcpMessage.OfferMessage;
import logger.LogStatus;
import logger.Logger;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DHCPClient {

    private final OfferMessage offerMessage;

    public DHCPClient(OfferMessage offerMessage) {
        this.offerMessage = offerMessage;
    }

    public void sendOffer() throws Exception {

        byte[] offer = offerMessage.build();

        // DHCP broadcast
        InetAddress broadcastAddress = InetAddress.getByName("255.255.255.255");
        int clientPort = 68;

        DatagramPacket packet = new DatagramPacket(
                offer,
                offer.length,
                broadcastAddress,
                clientPort
        );

        DatagramSocket socket = new DatagramSocket();
        socket.setBroadcast(true);

        socket.send(packet);
        socket.close();


        Logger.getInstance().log(LogStatus.INFO,"DHCP Offer sent to 255.255.255.255:68");

    }
}
