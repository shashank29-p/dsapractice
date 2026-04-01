/*
package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MongoBackup {
    public static void main(String[] args) {

    }

    public void mongoBackup(){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("post");
        FindIterable<Document> iterable = collection.find();
        MongoCursor<Document> iterator = iterable.iterator();
        try {
            final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            Path backupFilePath = Files.createTempDirectory("Backup");
            String fileNamePrefix =
                    "backup_" + LocalDateTime.now().format(dateTimeFormatter);
            File file = new File(backupFilePath.toFile().getAbsolutePath() +
                    File.separator + fileNamePrefix + ".json");
            ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            byte[] resource = file.getPath().getBytes();

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
*/
