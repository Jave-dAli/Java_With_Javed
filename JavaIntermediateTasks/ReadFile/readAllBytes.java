package ReadFile;
import java.io.*;
import java.nio.file.*;
public class readAllBytes {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String s=new String(Files.readAllBytes(Paths.get("C:\\Users\\javed\\Documents\\Jon.txt")));
        System.out.println(s);
    }
}
