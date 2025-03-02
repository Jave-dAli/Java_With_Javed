package Building_Queue.Simple_Queue;

import java.util.Arrays;

public class Queue {

    private int[] items;
    private int front;
    private int rear;
    private int count;
    Queue(int capacity){
        items=new int[capacity];
    }
    public void enqueue(int item){
        if(count==items.length)
            throw new IllegalStateException("Queue limit reached...");
        items[rear++]=item;
        count++;
    }
    public int dequeue(){
        var item=items[front];
        items[front++]=0;
        count--;
        return item;
    }
    public String toString() {
        return Arrays.toString(items);
    }
}
