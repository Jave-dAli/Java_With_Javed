package Building_ArrayList;

public class Demo {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(5);
        array.insert(10);
        array.insert(15);
        array.insert(20);
        System.out.println(array.indexOf(20));
//        array.print();
    }
}
