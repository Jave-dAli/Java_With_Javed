package WriteFile;
import java.io.*;
public class bufferWriter {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\javed\\Documents\\tyrion.txt"));
        bw.write("Tyrion is the most wise man in got.");
        bw.close();
    }
}
