package Recursion;

public class XpowerN2 {

    static int calcPower(int base, int power) {
        if (power == 0)
            return 1;
        if (base == 0)
            return 0;
        if (power % 2 == 0)
            return calcPower(base, power / 2) * calcPower(base, power / 2);
        else return calcPower(base, power / 2) * calcPower(base, power / 2) * base;

    }

    public static void main(String[] args) {
        // Stack Height Is Log(n).
        int base = 2, power = 5;
        int result = calcPower(base, power);
        System.out.println(result);
    }
}
