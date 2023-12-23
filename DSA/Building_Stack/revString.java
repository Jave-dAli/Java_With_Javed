package Building_Stack;

import java.util.Stack;

public class revString {
    public static String revString(String str){
        String newStr="";
        Stack<Character> stack=new Stack<>();
        for(char c : str.toCharArray())
            stack.push(c);
        while(!stack.isEmpty())
            newStr+=stack.pop();
        return newStr;
    }

    public static void main(String[] args) {
        String str="abc";
        System.out.println(revString(str));
    }
}
