package Task01;

import java.util.Objects;

public class DoubleLinkedList {
    Node head;
    DoubleLinkedList(){
        head=null;
    }
    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertAtBeginning(Node node){
        if(head!=null) {
            node.next = head;
            head.prev = node;
        }
        head=node;
    }
    public void insertAtEnd(String name){
        Node newNode=new Node(name);
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=newNode;
        newNode.prev=curr;
    }
    public void insertAtEnd(Node node){
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=node;
        node.prev=curr;
    }
    public void insertAfterName(String name, Node node){
        Node curr=head;
        while(!Objects.equals(curr.name, name)){
            curr=curr.next;
        }
        node.next=curr.next;
        curr.next.prev=node;
        curr.next=node;
        node.prev=curr;
    }
    public void insertBeforeName(String name, Node node){
        Node curr=head;
        while(!Objects.equals(curr.name, name)) {
            curr = curr.next;
        }
            node.prev=curr.prev;
            curr.prev.next=node;
            node.next=curr;
            curr.prev=node;
    }
    public void makeCircular(){
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=head;
    }
    public void printAll(){
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
        list.insertAtBeginning("4th");
        Node node=new Node("0th");
        list.insertAtBeginning(node);
        list.printAll();
    }
}
