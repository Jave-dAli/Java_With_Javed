package Building_Queue.Building_Priority_Queue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items=new int[5];
    private int count;
    private int front;
    PriorityQueue(){}
    PriorityQueue(int capacity){
        items =new int[capacity];
    }

    // add(obj) O(n)
    public void add(int item){
        if(isFull()){
            int[]items2=new int[2*items.length];
            System.arraycopy(items, 0, items2, 0, items.length);
            items=items2;
        }
        var i = shiftItemsToInsert(item);
        items[i]=item;
        count++;
    }
    public int shiftItemsToInsert(int item){
        int i;
        for(i=count-1; i>=0; i--){
            if(items[i]>item)
                items[i+1]=items[i];
            else break;
        }
        return i+1;
    }

    // remove O(1)
    public int remove(){
        if(isEmpty())
            throw new IllegalStateException("Queue Empty");
        return items[--count];
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    // remove()

    // isEmpty()
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count==items.length;
    }

    // peek()
}
