package StackUsingLinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next = null;
    }
}

public class LinkedListStack {
    Node head;
    int size;
    public boolean isEmpty(){
        return head == null;
    }
    public int getSize(){
        return size;
    }
    public void display(){
        Node curr=head;
        while(curr.next != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    public void push(int value){
        Node node = new Node(value);
        if(head == null) {
            head = node;
            size++;
            return;
        }
        Node curr = head;
        while(curr.next!=null)
            curr = curr.next;
        curr.next = node;
        size++;
    }
    public int pop(){
        if(getSize()==1) {
            int data = head.data;
            head = null;
            return data;
        }

        Node curr = head;
        Node prev = null;
        while(curr.next!=null) {
            prev = curr;
            curr = curr.next;
        }
        int temp = curr.data;
        prev.next = null;
        size--;
        return temp;
    }

}
