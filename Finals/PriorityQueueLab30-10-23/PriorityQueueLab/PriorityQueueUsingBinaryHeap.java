package Lab_07.PriorityQueue;

public class PriorityQueueUsingBinaryHeap {
    private int[] list;
    private int size;
    private int capacity;
    PriorityQueueUsingBinaryHeap(int capacity){
        this.capacity = capacity;
        list = new int[capacity];
        size = 0;
    }
    public void insert(int data){
        if(size == capacity){
            System.out.println("Capacity reached");
            return;
        }
        else if(size == 0){
            list[size++] = data;
            return;
        }
        list[size++] = data;
        if(list[size-1] < size-3) {
            for (int i = size - 1; i >= 0; i = i / 2) {
                if (data > list[i]) {
                    int temp = list[i];
                    list[i] = list[size];
                    list[size] = temp;
                }
            }
        }
    }
    public void display(){
        System.out.println("Display...");
        for(int i=0; i<size; i++){
            System.out.print(list[i]+" ");
        }
    }

    public static void main(String[] args) {
        PriorityQueueUsingBinaryHeap pq = new PriorityQueueUsingBinaryHeap(5);
        pq.insert(5);
        pq.insert(3);
        pq.insert(7);
        pq.display();
    }
}