package Streams.Input.Output;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNio {
    public static void main(String[] args) {
        Path path = Paths.get("/home/user/Documents/ideaProjects/TestProjects/src/Streams/Input/Output");

        try (OutputStream outputStream =  Files.newOutputStream(path)){
           outputStream.write("Semicolon Africa".getBytes());
        }

         catch (IOException e) {
             System.err.println(e.getMessage());
        }

    }
}
