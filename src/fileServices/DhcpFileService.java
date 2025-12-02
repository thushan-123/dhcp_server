package fileServices;

import fileServices.dto.FileData;

public class DhcpFileService implements DhcpFileServiceRepository{
    @Override
    public boolean createFile(String filename) {
        return false;
    }

    @Override
    public FileData getDhcpValues(String filename) {
        return null;
    }
}
