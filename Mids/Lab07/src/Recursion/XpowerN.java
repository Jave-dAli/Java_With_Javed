package Recursion;

public class XpowerN {
    static int calcPower(int base, int power) {
        if (power == 0)
            return 1;
        if (base == 0)
            return 0;

        int xPownm1 = calcPower(base, power - 1);
        int xPown = base * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        // The Length Of The Stack Is N.
        int base = 2, power = 5;
        int result = calcPower(base, power);
        System.out.println(result);
    }
}
