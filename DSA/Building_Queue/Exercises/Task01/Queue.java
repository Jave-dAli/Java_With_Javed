package Building_Queue.Exercises.Task01;

import java.util.Arrays;

// Given an integer K and a queue of integers, write code to reverse the
//order of the first K elements of the queue.
public class Queue {
    private int[] items=new int[5];
    private int count;
    private int front;
    private int rear;
    public void enqueue(int item){
        if(count==items.length)
            throw new IllegalStateException("Queue is full.");
        items[rear++]=item;
        count++;
    }
    public int dequeue(){
        var item=items[front];
        items[front++]=0;
        count--;
        return item;
    }
    public void reverse(int k){
        int temp;
        for(int i=0; i<2; i++){
            temp=items[i];
            items[i]=items[k];
            items[k--]=temp;
        }
    }
    public String toString(){
        return Arrays.toString(items);
    }
}
