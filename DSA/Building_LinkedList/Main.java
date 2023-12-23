package Building_LinkedList;

public class Main {
    public static void main(String[] args) {
        linkedList linkedList=new linkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);
        linkedList.addFirst(5);
//        linkedList.printList();
        System.out.println(linkedList.isCircular());

    }
}
