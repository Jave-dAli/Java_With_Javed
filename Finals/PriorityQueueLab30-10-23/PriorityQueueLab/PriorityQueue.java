package BinaryHeap;

public class PriorityQueue {
    private int[] list;
    private int capacity;
    private int size;
    PriorityQueue(int capacity){
        this.capacity = capacity;
        this.size = 0;
        list = new int[capacity];
    }
    public void insert(int item){
        if(list.length == size){
            System.out.println("Queue is full");
            return;
        }

        list[size++] = item;
//        SiftUp(size);
    }

    private void SiftUp(int i) {
        while(i>1 && list[parent(i)] < list[i]){
            swap(list[parent(i)], list[i]);
            i = parent(i);
        }
    }

    private void swap(int i, int i1) {
        int temp = i;
        i = i1;
        i1 = temp;
    }

    public int parent(int item){
        int idx = indexOf(item);
        try {
            return list[(idx / 2) - 1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return -1;
    }
    public int leftChild(int item){
        int idx = indexOf(item);
        return list[(idx*2) - 1];
    }
    public int rightChild(int item){
        return list[(indexOf(item)*2)];
    }
    private int indexOf(int item){
        for(int i=0; i<size; i++){
            if(list[i] == item)
                return i+1;
        }
        return -1;
    }
    public void display(){
        System.out.println("Size: "+size);
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
