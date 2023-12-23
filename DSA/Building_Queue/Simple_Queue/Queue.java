package Building_Queue.Simple_Queue;

import java.util.Arrays;

public class Queue {

    private int[] items;
    private int front;
    private int rear=0;
    private int count;
    Queue(int capacity){
        items=new int[capacity];
    }
    public void enqueue(int item){
        if(isFull())
            throw new IllegalStateException("Queue limit reached...");
        items[rear++ % items.length]=item;
        count++;
    }

    private boolean isFull() {
        return count == items.length;
    }

    public int dequeue(){
        var item=items[front];
        items[front++]=0;
        count--;
        return item;
    }
    public void print() {
        for(int i=rear; i<=front; i++)
            System.out.print(items[i]+" ");
    }
}
