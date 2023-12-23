package Building_Tree.BinaryTree;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
class BinaryTree {
    int idx = -1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1)
            return null;
        Node curr = new Node(nodes[idx]);
        return new Node (5);
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World of Trees.");
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
    }
}
