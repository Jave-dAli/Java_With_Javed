package Recursion;
// move all x to the end of string void(String str, int idx, int count, String newString)
public class shiftAllCharsAtEnd {
    /*static void shiftAtEnd(String str, int idx, int count, String newString){
        if(idx==str.length()) {
            repeat('x', count);
            return;
        }

        if(str.charAt(idx)=='x'){
            count++;
        }else {
            System.out.print(str.charAt(idx));
            newString+=str.charAt(idx);
        }
        shiftAtEnd(str, ++idx, count, newString);
    }
    static void repeat(char c, int times){
        for(int i=0; i<times; i++)
            System.out.print(c);
    }*/
    static void moveAllX(String str, int idx, int count, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString+=currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="xabxxabxa";
        int idx=0;
        int count=0;
        String newString="";
//        shiftAtEnd(str, idx, count, newString);
        moveAllX(str, idx, count, newString);
    }
}
