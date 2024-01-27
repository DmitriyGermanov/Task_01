package model.file_handler;

import java.io.*;

public class FileHandler implements Writable {

    public void writeObject(String content, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        }
    }

}



