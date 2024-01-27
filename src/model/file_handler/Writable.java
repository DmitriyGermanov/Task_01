package model.file_handler;


import java.io.IOException;

public interface Writable{

    void writeObject(String content, String fileName) throws IOException;

}
