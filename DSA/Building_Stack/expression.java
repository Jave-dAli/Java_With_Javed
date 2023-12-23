package Building_Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class expression {
    private static final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');
    private static final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private static Stack stack;

    public static boolean isBalanced(String exp){
        stack=new Stack();
        for(char ch:exp.toCharArray()){
            if (isLeftBracket(ch)){
                stack.push(ch);
                continue;
            }
            if(isRightBracket(ch)){
                if(isEmpty(stack))
                    return false;

                char c= (char) stack.peek();
                if(!bracketsMatch(c, ch))
                    return false;
                stack.pop();
            }

        }
        return stack.empty();
    }
    private static boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private static boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
    private static boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
    private static boolean isEmpty(Stack stack){
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String exp="(3}8*3){";
        System.out.println(isBalanced(exp));
    }
}