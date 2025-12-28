package fileServices;

import fileServices.dto.FileData;
import fileServices.dto.IpAndMac;

import java.util.List;

public interface DhcpFileServiceRepository {
    public boolean createFile(String filename);

    public FileData getDhcpValues(String filename);

    public List<IpAndMac> showDhcpPool (String filename);
}
