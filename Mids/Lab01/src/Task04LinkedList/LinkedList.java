/*
Name: Javed Ali
CMS: 023-22-0191
Section: E
 */

package Task04LinkedList;

public class LinkedList implements List{
    private Node head;
    private int size;
    public static void toString(List list){
        list.display();
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2, 22);
        list.display();
        list.remove(4);
        list.display();
        Node n=new Node(22);
        list.remove(n);
        list.display();
        list.size();
        List l2=list.duplicate();
        l2.display();

    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {
        Node node=new Node(item);
        if(head==null)
            head=node;
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=node;
        }
        size++;
    }

    @Override
    public void add(int index, Object item) {
        Node node=new Node(item);
        int idx=1;
        Node curr=head;
        while(idx<index){
            curr=curr.next;
            idx++;
        }
        node.next=curr.next;
        curr.next=node;
        size++;
    }

    @Override
    public void remove(int index) {
        int idx=1;
        Node curr=head;
        while(idx<index){
            curr=curr.next;
            idx++;
        }
        curr.next=curr.next.next;
        size--;
    }

    @Override
    public void remove(Node item) {
        Node curr=head;
        while(curr.next.data!=item.data){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;
    }

    @Override
    public List duplicate() {
        LinkedList list=new LinkedList();
        Node curr=head;
        while(curr.next!=null){
            list.add(curr.data);
            curr=curr.next;
        }
        list.add(curr.data);
        return list;
    }

    @Override
    public List duplicateReversed() {
        LinkedList list=new LinkedList();
        Node curr=head;
        while(curr.next!=null){

        }

        return null;
    }

    @Override
    public void display() {
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
}
