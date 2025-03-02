package Lab_07.PriorityQueue;

public class PriorityQueueUsingUnsortedArray {
    private int[] list;
    private int size;
    private int capacity;
    public PriorityQueueUsingUnsortedArray(int capacity) {
        this.capacity = capacity;
        this.list = new int[capacity];
        this.size = 0;
    }
    public void insert(int data) {
        if (size == capacity) {
            System.out.println("Priority Queue is full");
            return;
        }

        list[size++] = data;
    }

    public void display(){
        for(int i=0; i<size; i++)
            System.out.print(list[i]+" ");
        System.out.println();
    }

    public int extractMax() {
        if (size == 0) {
            System.out.println("PQ is empty");
            return -1;
        }

        int max = list[0], idx = 0;

        for (int i = 1; i < size; i++) {
            if(list[i] > max) {
                max = list[i];
                idx = i;
            }
        }
        for(int i=idx; i<size-1; i++){
            list[i] = list[i+1];
        }
        size--;

        return max;
    }


    public int getMax() {
        if(size == 0){
            System.out.println("Priority Queue is empty");
            return -1;
        }
        int max=list[0];
        for(int i=1; i<list.length; i++){
            if(list[i] > max)
                max = list[i];
        }
        return max;
    }

    public boolean searchData(int data) {
        if(size == 0){
            System.out.println("PQ empty");
            return false;
        }
        for (int j : list) {
            if (j == data)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        PriorityQueueUsingUnsortedArray pq = new PriorityQueueUsingUnsortedArray(5);

        pq.insert(5);
        pq.insert(3);
        pq.insert(1);
        pq.insert(9);

        pq.display();

        System.out.println(pq.extractMax());
        System.out.println(pq.extractMax());

        pq.display();

        pq.insert(11);
        System.out.println(pq.extractMax());
        System.out.println(pq.searchData(3));
    }
}
