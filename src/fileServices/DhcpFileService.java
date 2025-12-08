package fileServices;

import fileServices.dto.FileData;
import fileServices.dto.IpEitherMac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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
    public FileData getDhcpValues(String filename){
        try{
            // read the file
            String path = filename;
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException("File does not exist" + filename);
            }

        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
            return null;
        }

    }

    @Override
    public List<IpEitherMac> showDhcpPool(String filename) {
        return List.of();
    }
}
