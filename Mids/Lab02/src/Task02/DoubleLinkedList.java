package Task02;

import java.util.Objects;

public class DoubleLinkedList {
    Node head, tail;
    DoubleLinkedList(){
        head=tail=null;
    }
    public void insertAtBeginning(String name) {
        Node node=new Node(name);
        if(head==null){
            head=tail=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public void insertAtBeginning(Node node){
        if(head==null){
            head=tail=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public void insertAtEnd(String name){
        Node node=new Node(name);
        if(head==null){
            head=tail=node;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    public void insertAtEnd(Node node){
        tail.next=node;
        node.prev=tail;
        tail=node;
    }
    public void insertAfterName(String name, Node node){
        Node curr=head;
        while(!Objects.equals(curr.name, name)){
            curr=curr.next;
        }
        node.next=curr.next;
        curr.next.prev=node;
        node.prev=curr;
        curr.next=node;
        if(Objects.equals(curr.name, tail.name)){
            tail=curr;
        }
    }
//    public void insertBeforeName(String name, Node node){
//        Node curr=head;
//        while(!Objects.equals(curr.name, name)) {
//            curr = curr.next;
//        }
//        node.prev=curr.prev;
//        curr.prev.next=node;
//        node.next=curr;
//        curr.prev=node;
//    }
//    public void makeCircular(){
//        Node curr=head;
//        while(curr.next!=null)
//            curr=curr.next;
//        curr.next=head;
//    }
    public void printAll(){
        System.out.println("Head => "+head.name+": Tail => "+tail.name);
        if(head==null)
            System.out.println("Node empty");
        else {
            Node curr=head;
            while (curr.next != null) {
                System.out.print(curr.name+" => ");
                curr = curr.next;
            }
            System.out.println(curr.name);
        }
    }


    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.insertAtBeginning("1st");
        list.insertAtBeginning("2nd");
        list.insertAtBeginning("3rd");
        list.insertAtEnd("end");
        Node node=new Node("END");
        list.insertAtEnd(node);
        node=new Node("Hello");
        list.insertAfterName("END", node);

        list.printAll();
    }
}
