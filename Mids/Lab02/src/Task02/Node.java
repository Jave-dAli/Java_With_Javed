package Task02;

public class Node {
    String name;
    Node prev;
    Node next;
    Node(String name){
        this.prev=null;
        this.next=null;
        this.name=name;
    }
}

