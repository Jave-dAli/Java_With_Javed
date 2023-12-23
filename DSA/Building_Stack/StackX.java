package Building_Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackX {
    private final int[] array;
    private final int maxSize;
    private int top;

    StackX(int n){
        array=new int[n];
        maxSize=n;
    }
    public void Add(int[] list, int item){
        int[] list2 = new int[list.length+1];
        for(int i=0; i<list.length; i++)
            if(list[i+1] >= item){
                int temp = list[i];
                list[i] = item;

            }
    }
    public void push(int item) {
        if (top == maxSize)
            throw new StackOverflowError("Stack Full...");
        array[top++] = item;
    }
    public int pop(){
        if(top==0)
            throw new EmptyStackException();

        return array[--top];
    }
    public int peek(){
        if(top == 0)
            throw new IllegalStateException();

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