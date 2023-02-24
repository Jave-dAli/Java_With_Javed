package SirMujtabaAssignment;
import static java.lang.Math.*;
import java.util.Scanner;

public class EuclideanDistanceFormula{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x1, x2, y1, y2;
        System.out.print("Enter x, y coordinates of point 1: ");
        x1=sc.nextFloat();
        y1=sc.nextFloat();
        System.out.print("Enter x, y coordinates of point 2: ");
        x2=sc.nextFloat();
        y2=sc.nextFloat();
        double distance=sqrt(pow(x2-x1,2)+pow(y2-y1,2));
        System.out.println("X1 = "+x1+" Y1 = "+y1);
        System.out.println("X2 = "+x2+" Y2 = "+y2);
        System.out.println("Distance = "+distance);
    }
}
