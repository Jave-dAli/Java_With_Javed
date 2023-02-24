package SirMujtabaAssignment;

import javax.swing.*;

public class EncryptingStringJOptionPane{
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
        while(true) {
            String prompt = JOptionPane.showInputDialog("                1. Send a Secure and Encrypted Message\n" +
                    "                2. View Encrypted message\n" +
                    "                3. Decrypt and view the Original Message (Password Protected)\n" +
                    "                4. Exit\n" +
                    "                Please select an option: ");
            int option = Integer.parseInt(prompt);
            switch (option) {
                case 1 -> {
                    message = JOptionPane.showInputDialog(null, "Enter The Message: ");
                    encMsg = toEnc(message);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Here is The Encrypted Message\n"+encMsg);
                }
                case 3->{
                    String code=JOptionPane.showInputDialog("Enter The Password");
                    if(code.equals("ABC786")) {
                        decMsg=decrypt(encMsg);
                        JOptionPane.showMessageDialog(null, "Original Message: \""+decMsg+"\"");
                    }
                    else JOptionPane.showMessageDialog(null, "Oops! Wrong PassCode.");
                }
                case 4->{
                    JOptionPane.showMessageDialog(null, "Exiting The Program\nHave a Good Day.");
                    System.exit(1);
                }
            }
        }

    }

}
