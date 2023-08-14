package main.himash.Files;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class Illustration_01 {

    public static void main(String[] args) throws IOException {

        Logger log = Logger.getLogger(main.himash.Strings.Illustration_01.class.getName());

//        Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text"); // create file iif you want
        Path filePath = Files.writeString(Paths.get("E:/Github projects/Java11/src/main/resources/names.txt"), "HELLO MY WORLD");
        String fileContent = Files.readString(filePath);
        log.info(fileContent);

    }

}
