package WriteFile;
import java.io.*;
public class fileOutputStream {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\javed\\Documents\\tyrion.txt");
        String s="Tyrion is a witty person in got.";
        byte[] b=s.getBytes();
        fos.write(b);
        fos.close();
    }
}
