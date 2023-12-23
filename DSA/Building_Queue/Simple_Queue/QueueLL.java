package Building_Queue.Simple_Queue;

public class QueueLL {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node rear, front;
    private int size = 0;

    public boolean isEmpty(){
        return size ==0;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty())
            rear = front = node;
        else {
            node.next = front;
            front = node;
        }
        size ++;
    }
    public void display(){
        Node curr = rear;
        while(curr.next != null) {
            System.out.print(curr.data + "=>");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.enqueue(5);
        queue.enqueue(51);
        queue.enqueue(15);
        queue.display();
    }
}
