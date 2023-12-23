package Recursion;

public class Subsequence {
    static int count=0;
    static void subsequence(String str, int idx, String newString){
        if(idx==str.length()){
            count++;
            if(newString.length()==0) {
                System.out.println("null");
                return;
            }
            else {
                System.out.print(newString+" ");
                return;
            }
        }
        char currChar=str.charAt(idx);
        // to be
        subsequence(str, idx+1, newString+currChar);
        // or not to be
        subsequence(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str="abc";
        subsequence(str, 0, "");
        System.out.println("Total subsets: "+count);
    }
}
