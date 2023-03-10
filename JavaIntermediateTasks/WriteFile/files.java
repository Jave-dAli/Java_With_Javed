package WriteFile;
import java.io.*;
import java.nio.file.*;
import java.io.IOException;

public class files {
    public static void main(String[] args) throws IOException {
        String content="All wisdom of Jon is in Tyrion b/c jon knows nothing.";
        Files.write(Paths.get("C:\\Users\\javed\\Documents\\tyrion.txt"),
            content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
