import dhcpMessage.OfferMessage;
import enums.IpStatus;
import logger.LogStatus;
import logger.Logger;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        DatagramSocket serverSocket = null;

        try{
            serverSocket = new DatagramSocket(6767);
            Logger.getInstance().log(LogStatus.INFO, "DHCP Server run on 0.0.0.0:67");
            //System.out.println();

            while (true){
                byte[] receivedData = new byte[1024]; // create buffer
                DatagramPacket datagramPacket = new DatagramPacket(
                        receivedData,
                        receivedData.length
                );

                serverSocket.receive(datagramPacket);
                System.out.println(
                        new String(
                                datagramPacket.getData(),
                                0,
                                datagramPacket.getLength()
                        )
                );

                InetAddress clientAddress = datagramPacket.getAddress();
                int port = datagramPacket.getPort();

                // send DHCPOFFER message to client
                String response = "";
                byte[] responseData = response.getBytes();
                DatagramPacket resPacket = new DatagramPacket(
                        responseData,
                        responseData.length,
                        clientAddress,
                        port
                ); // create the response pkt

                serverSocket.send(resPacket);


            }


        }catch (Exception e){
            Logger.getInstance().log(LogStatus.ERROR, e.getMessage());
        }finally {
            if(serverSocket != null && !serverSocket.isClosed()){
                serverSocket.close();
            }
        }
    }

}