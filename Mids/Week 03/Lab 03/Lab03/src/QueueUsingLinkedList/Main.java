package QueueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        System.out.println(queue.isEmpty());
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.display();

    }

}
