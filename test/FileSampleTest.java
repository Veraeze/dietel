import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class FileSampleTest {
    @Test
    public void testCreateFile(){
        String filename = "Main.java";
        String location = "C:\\Users\\USER\\IdeaProjects\\dietel\\src\\chapter16";

        FileSample.createFile(location, filename);

        Path path = Paths.get(location, filename);
        System.out.println(path);
        assertTrue(Files.exists(path));
    }

    @Test
    public void testCreateDirectory(){
        String location = "C:\\Users\\USER\\IdeaProjects\\dietel\\src\\chapter16";
        FileSample.createDirectory(location);

        Path path = Path.of(location);

        assertTrue(Files.exists(path));
    }

    @Test
    public void testThatDirectoryCanBeDeleted(){
        String location = "C:\\Users\\USER\\IdeaProjects\\dietel\\chapter16";
        FileSample.deleteDirectory(location);

        Path path = Path.of(location);

        assertFalse(Files.exists(path));
    }

    @Test
    public void testThatFileCanBeDeleted(){
        String location = "C:\\Users\\USER\\IdeaProjects\\dietel\\src\\chapter16\\Main";
        FileSample.deleteFile(location);

        Path path = Path.of(location);

        assertFalse(Files.exists(path));
    }
}
