package Recursion;

public class rough {
    static void print(int num){
        if(num==0)
            return;
        System.out.println(num);
        print(--num);
    }
    public static void main(String[] args) {
        int[][]array=new int[4][5];
        System.out.println(array.length);
        System.out.println("Program Terminated...");
    }
}
