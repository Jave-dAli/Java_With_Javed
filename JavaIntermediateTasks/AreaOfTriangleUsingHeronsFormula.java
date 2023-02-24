package SirMujtabaAssignment;
import java.util.Scanner;
import static java.lang.Math.*;
public class AreaOfTriangleUsingHeronsFormula{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double a, b, c, area;
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        double p = (a+b+c)/2;
        area=sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("The area of the triangle is "+String.format("%.2f",area));
    }
}
