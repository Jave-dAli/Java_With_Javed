package Recursion;

public class fibonacci {
    static void printFibonacci(int a, int b, int n){
        if(n==0)
            return;
        int c=a+b;
        System.out.print(c+" ");
        printFibonacci(b, c, --n);
    }

    public static void main(String[] args) {
        int limit=5;
        int a=0, b=1, c=a+b;
        int n=10;
        System.out.print(a+" "+b+" ");
        printFibonacci(a, b, n-2);
    }
}
