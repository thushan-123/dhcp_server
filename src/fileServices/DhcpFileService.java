package fileServices;

import fileServices.dto.FileData;

import java.io.File;
import java.io.IOException;

public class DhcpFileService implements DhcpFileServiceRepository {
    @Override
    public boolean createFile(String filename) {
        try {
            File file = new File(filename);
            if(file.createNewFile()){
                return true;
            }else {
                System.out.println("File already exists : " + filename);
                return true;
            }
        }catch (IOException ioException){
            System.out.println("Error : " + ioException.getMessage());
            return false;
        }
    }

    @Override
    public FileData getDhcpValues(String filename) {
        return null;
    }
}
