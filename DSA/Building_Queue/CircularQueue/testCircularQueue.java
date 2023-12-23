package Building_Queue.CircularQueue;

public class testCircularQueue {
    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue(5);
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.dequeue();
        queue.enque(40);
        queue.dequeue();
        queue.enque(50);
        queue.enque(60);
        queue.enque(70);

        System.out.println(queue);
    }
}
