package SirMujtabaAssignment;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the message => ");
        String message=sc.nextLine();
        int[] asci=new int[message.length()];
        for(int i=0; i<message.length(); i++) {
            int a=message.charAt(i);
            asci[i]=(a);
        }
        System.out.println("Here is The Encrypted Message.");
        for(int i=0; i<asci.length; i++)
            System.out.print(asci[i]+" ");
        System.out.print("\nWould You LIke TO Decrypt The Message? (Y/N)");
        Character prompt=sc.next().charAt(0);
        if(prompt.equals('y')) {
            System.out.println("Decrypting The Message.");
            for(int i=0; i<asci.length; i++)
            {
                char c=(char)asci[i];
                System.out.print(c);
            }
        }
        else System.out.println("Have a Good Day.");
        char i=(char) asci[0];


    }
}
