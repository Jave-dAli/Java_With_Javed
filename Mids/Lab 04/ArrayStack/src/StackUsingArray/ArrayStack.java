package StackUsingArray;

public class ArrayStack {
    private int[] array;
    private int size;
    private int idx=-1;
    ArrayStack(int size){
        array=new int[size];
    }
    public int getCurrSize(){
        return size;
    }
    public int getFullSize(){
        return array.length;
    }
    public boolean isFull(){
        return size == array.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void display(){
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack OverFlowing...");
            return;
        }
        array[++idx] = value;
        size++;
    }
    public int pop(){
        int temp=array[getCurrSize()-1];
        array[getCurrSize()-1] = 0;
        size--;
        return temp;
    }
    public int peek(){
        return array[getCurrSize()-1];
    }
}
