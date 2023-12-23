package Building_ArrayList;

public class Array{
    private int[] items;
    private int[] items2;
    private int count=0;
    private void copy(){
        System.arraycopy(items, 0, items2, 0, items.length);
    }
    public Array(int length){
        items=new int[length];
    }
    void insert(int num){
        if(count==items.length){
            items2=new int[items.length*2];
            copy();
            items=items2;
        }
        items[count++]=num;
    }
    void removeAt(int index){
        if(index<0 || index>=count)
            throw new IllegalArgumentException();
        else{
            for(int i=index; i<count; i++)
                items[i]=items[i+1];
            count--;
        }
    }
    int indexOf(int num){
        int index=-1;
        for(int i=0; i<count; i++){
            if(items[i]==num){
                index=i;
                break;
            }
        }return index;
    }

    void print(){
        System.out.println("Array items include");
        for(int i=0; i<count; i++)
            System.out.println(items[i]);
    }
}
