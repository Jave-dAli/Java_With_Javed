package QueueUsingLinkedList;

public class Queue {
    private Node rear = null, front=null;
    private int size = 0;
    public void enqueue(int item){
        Node node = new Node(item);
        if(size==0) {
            front = rear = node;
            System.out.println("Added First Item: "+node.data);
        }
        else {
            rear.next = node;
            rear = node;
            System.out.println("Added: "+node.data);
        }
        size++;
    }
    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return 1;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public int size(){
        return size;
    }
    public void display(){
        System.out.println("Displaying...");
        Node curr = front;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
