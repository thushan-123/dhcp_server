package fileServices.fileReadWrite;

import enums.IpStatus;
import fileServices.dto.FileData;
import fileServices.dto.Headers;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;

public class FileService implements FileServiceRepository {
    @Override
    public FileData readContent(
            String fileId,
            String poolId,
            String poolName,
            Inet4Address defaultGateway,
            Inet4Address dns, Inet4Address subnetMask,
            Inet4Address networkIp,
            int numberOfIp,
            List<HashMap<HashMap<String, String>, IpStatus>> ips
    ) {
        return null;
    }

    @Override
    public boolean writeContent(
            String fileId,
            String poolId,
            String poolName,
            Inet4Address defaultGateway,
            Inet4Address dns,
            Inet4Address subnetMask,
            Inet4Address networkIp,
            int numberOfIp,
            List<HashMap<HashMap<String, String>, IpStatus>> ips
    ) {
        try {
            String firstLine = "ip-pool\t" +
                    poolId + "\t" +
                    poolName + "\t" +
                    networkIp.toString() + "\t" +
                    subnetMask.toString() + "\t" +
                    "5\t" +
                    numberOfIp + "\t";

            String defaultGatewayIp = "default-gateway" + defaultGateway.toString();
            String dnsIp = "dns" + dns.toString();

            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileId)));
            bw.write(firstLine);
            bw.newLine();
            bw.write(defaultGatewayIp);
            bw.newLine();
            bw.write(dnsIp);
            bw.newLine();
            bw.newLine();

            ips.forEach(ip -> {
                String line = ip.toString() + "\t";
                try {
                    bw.write(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            return true;

        }catch (Exception e){
            System.out.println("Error in writing content" + e.getMessage());
            return false;
        }
    }

    @Override
    public Headers getHeaders(String poolId) {

        try {
            // open the file read mode
            BufferedReader br = new BufferedReader(new FileReader(new File(poolId)));
            String line = br.readLine();
            String defaultGatewayIp = br.readLine();
            String dnsIp = br.readLine();
            String [] arr = line.split(" ");

            if (arr.length != 7 || defaultGatewayIp == null || dnsIp == null) {
                throw new RuntimeException("empty file content");
            }

            Headers header = new Headers();

            // ip-pool  <pool-id> <pool-name> <network-ip> <subnet-mask> <start-pool-line-number> <number-of-ips>
            header.setPoolId(poolId);
            header.setPoolName(arr[2]);
            header.setNetworkIp((Inet4Address) Inet4Address.getByName(arr[3]));
            header.setSubnetMask((Inet4Address) Inet4Address.getByName(arr[4]));
            header.setNumberOfIp(Integer.parseInt(arr[6]));

            header.setDefaultGateway((Inet4Address) Inet4Address.getByName(defaultGatewayIp));
            header.setDns((Inet4Address) Inet4Address.getByName(dnsIp));
            return header;
        }catch (Exception e){
            System.out.println("Error in getting headers" + e.getMessage());
            throw new RuntimeException(e);
        }
        //return null;
    }

    @Override
    public boolean addMacAndIp(String poolId, String mac, Inet4Address ip) {
        return false;
    }

}
/*
# ip-pool  <pool-id> <pool-name> <network-ip> <subnet-mask> <start-pool-line-number> <number-of-ips>
# default-gateway 192.168.1.1
# dns 8.8.8.8

# ip sub_pool <sub-pool-id> <size>    // line number 5  size 10  (next-sub-pool-line 17 (start-line + (sub-pool-id * size) +2) 5 + (10 * 1) + 2 = 17

ff:56:55:55:34:aa:12  192.168.1.100  5  ACTIVE  // <mac-address> <ip> <lease-time> <assign or available>
ff:56:55:55:34:aa:12  192.168.1.101  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.102  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.103  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.104  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.105  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.106  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.107  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.108  5  ACTIVE
ff:56:55:55:34:aa:12  192.168.1.109  5  INACTIVE

# ip sub_pool <sub-pool-id> <size>

 */