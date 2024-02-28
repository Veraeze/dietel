package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamSample {
    public static void main(String[] args) throws IOException{
        String location = "C:\\Users\\USER\\IdeaProjects\\dietel\\src\\array";

        Path path = Path.of(location);
        DirectoryStream<Path> directoryStream = null;

        try {
            directoryStream = Files.newDirectoryStream(path);
            directoryStream.forEach(System.out::println);
        }
        catch (IOException | SecurityException exception) {}
        finally{
            directoryStream.close();
        }
    }
}
