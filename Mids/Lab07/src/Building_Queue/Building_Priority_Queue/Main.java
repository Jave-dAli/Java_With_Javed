package Building_Queue.Building_Priority_Queue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(1);
        priorityQueue.add(4);
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.remove());
    }
}
