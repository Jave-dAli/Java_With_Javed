package Building_Tree.BST;

public class BST {
    private class Node{
        int value;
        Node left, right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public BST(){
        root = null;
    }
    public void insert(int value){
        insert(root, value);
    }
    private Node insert(Node root, int value){
        if(root == null)
            root = new Node(value);
        else if(value < root.value)
            root.left = insert(root.left, value);
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }
}
