import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        DatagramSocket serverSocket = null;

        try{
            serverSocket = new DatagramSocket(6767);
            System.out.println("DHCP Server run on 0.0.0.0:67");

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

                String response = "hii i am DHCP";
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
            e.printStackTrace();
        }finally {
            if(serverSocket != null && !serverSocket.isClosed()){
                serverSocket.close();
            }
        }
    }

    // developed by thush
}