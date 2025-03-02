package Task03Queue;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private final int capacity;
    private int count;

    Queue(int size){
        arr=new int[size];
        capacity=size;
        front=0;
        rear=-1;
        count=0;
    }
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        System.out.println("Inserting "+item);
        rear = (rear+1) % capacity;
            arr[rear] = item;
            count++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int item = arr[front];
        System.out.println("Removing "+item);
        arr[front]=0;
        front=(front+1)%capacity;
        count--;
        return item;
    }

    public int peek() {
        return arr[front];
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count == capacity;
    }
    public void displayEnqueue(){
        for(int i=0; i<capacity; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
