package ReadFile;
import java.io.*;
public class fileInputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis=new FileInputStream("C:\\Users\\javed\\Documents\\Jon.txt");
        byte[] buffer = new byte[50];
        fis.read(buffer);
        System.out.println(new String(buffer));
    }
}
