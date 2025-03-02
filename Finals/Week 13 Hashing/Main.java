import java.util.Arrays;

class LinearHash{
    int[] list;
    LinearHash(int capacity){
        list = new int[capacity];
    }
    public void insert(int item){
        int HC = getHashCode(item);
        if(list[HC] == 0)
            list[HC] = item;
        else{
            for(int i=0; i<list.length; i++){
                if(i == list.length-1 && list[HC] != 0){
                    int[] ls = list;

                    int temp[] = new int[list.length*2];
                    for(int j=0; j<list.length; j++){
                        temp[getHashCode(list[i])] = list[i];
                    }
                    return;
                }
                if(list[HC] == 0) {
                    list[HC] = item;
                    return;
                }
                HC = (HC+1)%list.length;
            }
        }
    }
    public int search(){
        return -1;
    }
    public int getHashCode(int item){
        return item % list.length;
    }
    public void display(){
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinearHash map = new LinearHash(5);
        map.insert(7);
        map.insert(2);
        map.insert(9);
        map.insert(2);
        map.insert(11);
//        map.insert(12);

        int[] list = {3, 5, 2, 9};
        int[] temp = new int[list.length];
        temp = list;
        list[0]=100;
        System.out.println(Arrays.toString(temp));

//        map.display();
    }
}