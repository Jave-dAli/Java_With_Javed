package StackUsingLinkedList;

public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        System.out.println("Size: "+stack.getSize());
        System.out.println("Is Empty(): "+stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());

        stack.display();
        System.out.println("Size: "+stack.getSize());
        System.out.println("Is Empty(): "+stack.isEmpty());

    }
}
