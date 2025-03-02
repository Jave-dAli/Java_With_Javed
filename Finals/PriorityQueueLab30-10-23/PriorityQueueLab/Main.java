package BinaryHeap;

public class Main {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(13);
        queue.insert(42);
//        queue.insert(29);
//        queue.insert(18);
//        queue.insert(14);
//        queue.insert(7);
//        queue.insert(18);
//        queue.insert(12);
//        queue.insert(11);
//        queue.insert(5);

//        queue.display();

        System.out.println(queue.parent(18));
//        System.out.println(queue.leftChild(42));
//        System.out.println(queue.rightChild(14));
    }
}
