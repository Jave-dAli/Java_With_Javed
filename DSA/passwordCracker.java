import java.util.Random;
import java.util.Scanner;

public class passwordCracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String u_pwd = scanner.nextLine();
        char[] pwd = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String pw = "";
        Random random = new Random();
        while(!pw.equals(u_pwd)) {
            pw = "";
            for(int i = 0; i < u_pwd.length(); i++) {
                char guess_pwd = pwd[random.nextInt(pwd.length)];
                pw = guess_pwd + pw;
            }
            System.out.println(pw);
            System.out.println("Cracking password...");
        }
        System.out.println("Your password is " + pw);
    }
}
