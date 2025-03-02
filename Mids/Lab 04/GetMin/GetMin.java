package GetMin;

public class GetMin {
    Node head;
    Node top;
    int min;
    GetMin(){
        head = null;
        top = null;
        min = 0;
    }
    public void push(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            top = node;
            min = data;
        }
        else{
            top.next = node;
            top = node;
        }
        if(data < min)
            min = data;

    }
    public Object pop(){
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        int data = curr.data;
        curr = null;
        return data;
    }
    public Object top(){
        return top.data;
    }
    public Object getMin(){
        return min;
    }
}
