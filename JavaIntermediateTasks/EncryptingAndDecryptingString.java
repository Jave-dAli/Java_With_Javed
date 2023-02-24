package SirMujtabaAssignment;

import java.util.Scanner;

public class EncryptingAndDecryptingString{
    public static String toEnc(String message)
    {
        String encMsg="";
        for(int i=0; i<message.length(); i++)
        {
            if(i%2==0)
                encMsg+=Character.toString((int)message.charAt(i)*2);
            else encMsg+=Character.toString((int)message.charAt(i)+5);
        }
        return encMsg;
    }
    public static String decrypt(String cipher)
    {
        String decMsg="";
        for(int i=0; i<cipher.length(); i++)
        {
            if(i%2==0)
                decMsg+=Character.toString((int)cipher.charAt(i)/2);
            else
                decMsg+=Character.toString((int)cipher.charAt(i)-5);
        }
        return decMsg;
    }
    public static void main(String[] args) {
        String message, encMsg="", decMsg="";
        Scanner sc=new Scanner(System.in);
        String prompt="1. Send a Secure and Encrypted Message\n" +
                "2. View Encrypted message\n" +
                "3. Decrypt and view the Original Message (Password Protected)\n" +
                "4. Exit\n\n" +
                "Please select an option: ";
        while(true)
        {
            System.out.print(prompt);
            int option=sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter a message => ");
                    Scanner input = new Scanner(System.in);
                    message = input.nextLine();
                    encMsg = toEnc(message);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Here is The Encrypted Message.");
                    System.out.println(encMsg);
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("Enter Password => ");
                    String code = sc.next();
                    if (code.equals("ABC786")) {
                        decMsg = decrypt(encMsg);
                        System.out.println("Original Message: \"" + decMsg + "\"");
                    } else System.out.println("Invalid PassCode\n");
                }
                case 4 -> {
                    System.out.println("Exiting The System");
                    System.exit(1);
                }
                default -> System.out.println("Kindly Opt 1 through 4.\n");
            }

        }
    }
}