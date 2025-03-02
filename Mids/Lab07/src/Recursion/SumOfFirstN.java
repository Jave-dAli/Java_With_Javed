package Recursion;

public class SumOfFirstN {

    static int sum(int num, int total) {
        if (num == 0)
            return total;
        total += num--;
        sum(num, total);

        return sum(num, total);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n, 0));

    }
}
