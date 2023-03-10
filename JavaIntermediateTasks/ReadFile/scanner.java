package ReadFile;
import java.io.*;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner scan=new Scanner(new File("C:\\Users\\javed\\Documents\\Jon.txt"));
        while(scan.hasNext()){
            String s=scan.nextLine();
            System.out.println(s);
        }
    }
}
