package Recursion;
// remove duplicates in a string void(String str, int idx)
public class removeDuplicates {
    static boolean[] map=new boolean[26];
    static void removeDuplicates(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(idx);
        if(map[currChar - 'a'])
            removeDuplicates(str, idx+1, newString);
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    public static void main(String[] args) {
        String str="abubakar";
        int idx=0;

        removeDuplicates(str, idx, "");
    }
}
