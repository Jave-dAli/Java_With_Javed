package Building_Queue.Simple_Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(33);
        queue.enqueue(1);
        queue.enqueue(12);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(100);
        System.out.println(queue);
    }
}
