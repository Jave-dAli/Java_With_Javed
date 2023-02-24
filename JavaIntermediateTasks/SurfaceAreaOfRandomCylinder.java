package SirMujtabaAssignment;
import java.lang.Math;
import java.util.Random;

public class SurfaceAreaOfRandomCylinder{
    public static void main(String[] args) {
        int radius, height;
        double volume, surfaceArea;
        Random rand=new Random();
        radius=rand.nextInt(10);
        height=rand.nextInt(10);
        volume=(Math.PI)*(radius*radius)*height;             //pi*r*r*h;
        surfaceArea=((2*(Math.PI)*radius*height))+(2*(Math.PI)*(radius*radius));         //(2*pi*r*h)+(2*pi*r*r);
        System.out.println("Radius = "+radius);
        System.out.println("Height = "+height);
        System.out.println("Volume = "+volume);
        System.out.println("Surface Area = "+surfaceArea);
    }
}
