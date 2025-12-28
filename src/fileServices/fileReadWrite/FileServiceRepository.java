package fileServices.fileReadWrite;

import enums.IpStatus;
import fileServices.dto.FileData;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;

public interface FileServiceRepository {

    public FileData readContent(
            String fileId,
            String poolId,
            String poolName,
            Inet4Address defaultGateway,
            Inet4Address dns,
            Inet4Address subnetMask,
            Inet4Address networkIp,
            int numberOfIp,
            List<HashMap<HashMap<String, String>, IpStatus>> ips
    );

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
    );

    //public getHeaders

}

