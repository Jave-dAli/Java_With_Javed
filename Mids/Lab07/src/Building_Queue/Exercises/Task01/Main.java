package Building_Queue.Exercises.Task01;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(8);
        queue.enqueue(43);
        queue.enqueue(40);
        System.out.println(queue);
        queue.reverse(4);
        System.out.println(queue);
    }
}
