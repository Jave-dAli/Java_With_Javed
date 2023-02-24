package SirMujtabaAssignment;

import java.util.Random;

public class RandomTelephoneNumberGenerator{
    public static void main(String[] args) {
        int a, b, c;
        Random rand=new Random();
        for(int i=0; i<10; i++)
        {
            //Using dashes before indexes 3 and 6.
            if((i==3) || (i==6))
                System.out.print("-");

            // For indexes 0, 1, and 2 (1st 3 digits) the random numbers are less than 8.
            if(i<3)
                System.out.print(rand.nextInt(8));
            else if(i<6)
            {
                a=rand.nextInt(10);
                b= rand.nextInt(10);
                if(i==3) {
                    a = rand.nextInt(9);
                    System.out.print(a);
                }
                if(i==4)
                {
                    if(a<8)
                        b=rand.nextInt(10);
                    else
                        b=rand.nextInt(4);
                    System.out.print(b);
                }
                if(i==5)
                {
                    if(b<3)
                        c=rand.nextInt(10);
                    else
                        c=rand.nextInt(2);
                    System.out.print(c);
                }

            }
            else
                System.out.print(rand.nextInt(10));

        }
    }
}
