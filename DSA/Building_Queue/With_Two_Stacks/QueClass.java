package Building_Queue.With_Two_Stacks;

import java.util.Stack;

public class QueClass {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException("Hello javed.");
        moveStack1ToStack2();
        return stack2.pop();
    }

    private void moveStack1ToStack2() {
        if(stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException("Hello javed.");
        moveStack1ToStack2();
        return stack2.peek();
    }
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
