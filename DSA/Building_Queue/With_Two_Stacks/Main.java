package Building_Queue.With_Two_Stacks;

public class Main {
    public static void main(String[] args) {
        // Q [10, 20, 30]
        // S1 [10, 20, 30]      // enqueue
        // S2 [30, 20, 10]      // dequeue

        QueClass queue =new QueClass();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        var first=queue.dequeue();
        System.out.println(first);
    }
}
