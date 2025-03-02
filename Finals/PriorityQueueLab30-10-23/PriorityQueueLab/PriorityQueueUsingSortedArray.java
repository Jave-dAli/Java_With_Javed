package Lab_07.PriorityQueue;

public class PriorityQueueUsingSortedArray {
    private int[] list;
    private int size;
    private int capacity;
    private int idx;
    public PriorityQueueUsingSortedArray(int capacity) {
        this.capacity = capacity;
        this.list = new int[capacity];
        this.size = 0;
        this.idx = -1;
    }
    public void insert(int data) {
        if (size == capacity) {
            System.out.println("Priority Queue is full");
            return;
        }
        else if(size == 0){
            list[size++] = data;
            return;
        }
        else{
            int idx = 0;
            for(int i=0; i<size; i++){
                if(list[i]>data){
                    idx = i;
                    break;
                }
                else {
                    list[size++] = data;
                    return;
                }
            }
            int i;
            for(i=size; i>idx; i--){
                list[i] = list[i-1];
            }
            list[i] = data;

        }
        size++;
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

        return list[size-- - 1];
    }


    public int getMax() {
        if(size == 0){
            System.out.println("Priority Queue is empty");
            return -1;
        }
        return list[size-1];
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

        PriorityQueueUsingSortedArray pq = new PriorityQueueUsingSortedArray(5);

        pq.insert(5);
        pq.insert(3);
        pq.insert(1);
        pq.insert(9);

        pq.display();

        System.out.println(pq.extractMax());
        pq.display();
        System.out.println(pq.extractMax());

        pq.display();

        pq.insert(11);
        System.out.println(pq.extractMax());
        System.out.println(pq.searchData(3));
        pq.display();
        System.out.println(pq.getMax());
        pq.display();
    }
}