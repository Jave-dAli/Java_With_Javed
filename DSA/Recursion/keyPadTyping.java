package Recursion;

public class keyPadTyping {
    static String[] keypad={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    static void printCombinations(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];    // let it be 2, 2-0=2, we get "def"
        for(int i=0; i<mapping.length(); i++){
            printCombinations(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="4";
        printCombinations(str, 0, "");
    }
}
