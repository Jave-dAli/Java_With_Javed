package Task03Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
//        queue.show();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element is: "+queue.peek());
        queue.dequeue();
        System.out.println("Front element is: "+queue.peek());

        System.out.println("Queue size is "+queue.size());

        queue.dequeue();
        queue.dequeue();

        if(queue.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");

    }
}
