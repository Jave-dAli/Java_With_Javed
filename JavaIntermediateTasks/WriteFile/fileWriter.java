package WriteFile;

import java.io.*;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\javed\\Documents\\tyrion.txt");
        fw.write("Tyrion is the most wise and witty man in got.");
        fw.close();
    }
}
