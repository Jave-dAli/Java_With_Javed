package Backtracking;

// try with string builder @ newString.
public class Subsets {
    static int count=0;
    static void findSubsets(String str, int idx, String newString){
        if(idx==str.length()){
            count++;
            if(newString.length()==0){
                System.out.println("null");
                return;
            }else{
                System.out.print(newString+" ");
                return;
            }
        }
        char currChar=str.charAt(idx);

        // to be
        findSubsets(str, idx+1, newString+currChar);
        // to not be
        findSubsets(str, idx+1, newString);


    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str, 0, "");
        System.out.println("Total Subsets: "+count);
    }
}
