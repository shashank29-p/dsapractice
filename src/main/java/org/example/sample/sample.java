package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class sample {
    public static void main(String[] args) throws IOException {
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("C:\\");
            String sample="abcd";
            objectMapper.writeValue(file,sample);
            Path path= Files.createDirectory(Path.of("C:\\"));
            List<File> fileList= new ArrayList<>();
            File[] files= path.toFile().listFiles();
            for(File f:files){
                if(f.exists()){
                    fileList.add(f);
                }
            }
            fileList.forEach(temp->{
                byte[] bytes=new byte[1024];
                try {
                    ZipOutputStream zipOutputStream=new ZipOutputStream(new FileOutputStream(file));
                    ZipEntry zipEntry=new ZipEntry(String.valueOf(file));
                    zipOutputStream.putNextEntry(zipEntry);
                    FileInputStream inputStream = new FileInputStream(file);
                    int length;
                    while ((length = inputStream.read(bytes)) >= 0) {
                        zipOutputStream.write(bytes, 0, length);
                    }
                    zipOutputStream.closeEntry();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });
        }catch (IOException e){
            throw new IOException("Error while writing to file");
        }
    }
}
