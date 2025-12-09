package fileServices;

import enums.IpStatus;
import fileServices.dto.FileData;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;

public class FileReaderService implements FileReaderServiceRepository{
    @Override
    public FileData readContent(
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
    public FileData writeContent(
            String poolId,
            String poolName,
            Inet4Address defaultGateway,
            Inet4Address dns,
            Inet4Address subnetMask,
            Inet4Address networkIp,
            int numberOfIp,
            List<HashMap<HashMap<String, String>, IpStatus>> ips
    ) {
        return null;
    }
}
