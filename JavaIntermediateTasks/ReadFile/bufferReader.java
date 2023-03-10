package ReadFile;
import java.io.*;
public class bufferReader {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\javed\\Documents\\Jon.txt"));
        String s=br.readLine();
        System.out.println(s);
        br.close();
    }
}
