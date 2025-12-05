package fileServices;

import fileServices.dto.FileData;
import fileServices.dto.IpEitherMac;

import java.util.List;

public interface DhcpFileServiceRepository {
    public boolean createFile(String filename);

    public FileData getDhcpValues(String filename);

    public List<IpEitherMac> showDhcpPool (String filename);
}
