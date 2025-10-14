import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) {

        try{
            DatagramSocket serverSocket = new DatagramSocket(67);
            System.out.println("DHCP Server run on 0.0.0.0:67");

            byte[] receivedData = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(receivedData, receivedData.length);


        }catch (Exception e){
            System.out.println("Err : " + e);
            System.exit(1); // err is occur exit program with 1
        }
    }
}