package WriteFile;
import java.io.*;
public class printWriter {
    public static void main(String[] args)throws IOException {
        PrintWriter pw=new PrintWriter("C:\\Users\\javed\\Documents\\tyrion.txt");
        pw.println("Tyrion is Tyrion.");
        pw.close();
    }
}
