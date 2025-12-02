package fileServices;

import fileServices.dto.FileData;

public interface DhcpFileServiceRepository {
    public boolean createFile(String filename);

    public FileData getDhcpValues(String filename);
}
