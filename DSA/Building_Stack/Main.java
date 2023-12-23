package Building_Stack;

public class Main {
    public static void main(String[] args) {
        StackX stack=new StackX(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
//        stack.push(3);
//        stack.push(4);
        System.out.println(stack.peek());
//        stack.Add(5);
    }
}
