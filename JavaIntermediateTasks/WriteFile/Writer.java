package WriteFile;
import java.io.*;
public class Writer {
    public static void main(String[] args) throws IOException{
        java.io.Writer wr=new OutputStreamWriter(new FileOutputStream("C:\\Users\\javed\\Documents\\tyrion.txt"));
        wr.write("Tyrion is the most wise man in got.");
        wr.close();
    }
}
