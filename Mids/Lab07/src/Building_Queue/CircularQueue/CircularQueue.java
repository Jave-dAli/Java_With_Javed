package Building_Queue.CircularQueue;

import java.util.Arrays;

public class CircularQueue {
    private int[] items;
    private int rear;
    private int front;
    private int count;

    CircularQueue(int capacity) {
        items = new int[capacity];
        rear = 0;
    }

    // enque();
    public void enque(int item) {
        if (count == items.length) {
            throw new IllegalStateException("Queue limit reached.");
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    // deque();
    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    // peek();
    public int peek(){
        return items[front];
    }
    // isEmpty();
    public boolean isEmpty(){
        return count == 0;
    }
    // isFull();
    public boolean isFull(){
        return count==items.length;
    }
    // toString();
    @Override
    public String toString() {
        return Arrays.toString(items);
    }


}
