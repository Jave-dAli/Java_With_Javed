package Recursion;

public class factorial {
    static int factorial(int num){
        int result=1;
        if(num==1)
            return result;
        result*=num;
        return result*factorial(num-1);

    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }
}
