package SirMujtabaAssignment;
import java.util.Scanner;
public class WordsPalindromeChecker{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] array =new String[5];

        //Get five words to check
        System.out.println("Enter any five words...");
        for(int i=0; i<array.length; i++)
        {
            System.out.print("Enter word "+(i+1)+": ");
            array[i]=sc.next();
        }
        System.out.println("========================================");
        System.out.println("Word\t\t\t\t\tPalindrome");
        System.out.println("========================================");
        for(int i=0; i<array.length; i++)
        {
            System.out.printf("%-15s", array[i]);
            boolean flag=true;
            for(int j=0; j<(array[i].length())/2; j++)
            {
                //Word is first changed to lowercase and then the logic of palindrome is applied
                //i.e. word 'Level' is palindrome regardless of letter case.
                if(array[i].toLowerCase().charAt(j)!=array[i].toLowerCase().charAt(array[i].length()-(j+1)))
                { flag=false;
                    break;}
            }
            if(flag)
                System.out.printf("%15s %n", "Yes");
            else System.out.printf("%15s %n", "No");
        }
    }
}
