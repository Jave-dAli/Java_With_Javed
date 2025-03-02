package Backtracking;

// time-complexity => O(n*n!).
public class Permutations {
    static void findPermutations(String str, String newString){
        if(str.length()==0){
            System.out.println(newString);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            findPermutations(newStr, newString+currChar);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        findPermutations(str, "");

    }
}
