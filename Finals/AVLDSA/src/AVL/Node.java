package AVL;

public class Node {
    int element;
    int height;
    Node left, right;
    public Node(int value){
        this.element = value;
        height = 0;
    }
}
