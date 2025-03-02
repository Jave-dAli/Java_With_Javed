package Building_Stack;

import java.util.Arrays;

public class StackX {
    private final int[] array;
    private final int maxSize;
    private int top;

    StackX(int n){
        array=new int[n];
        maxSize=n;
    }
    public void push(int item) {
        if (top == maxSize){
            System.out.println("Stack is full.");
            throw new StackOverflowError();
    }
        array[top++] = item;
    }
    public int pop(){
        if(top==0) {
            System.out.println("stack is empty.");
            throw new StackOverflowError();
        }
        return array[--top];
    }
    public int peek(){
        if(top == 0) {
            System.out.println("Illegat state expression.");
            throw new IllegalStateException();
        }
        return array[top-1];
    }
    public boolean isEmpty(){
        return top==0;
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(array, 0, top);
        return Arrays.toString(content);
    }
}