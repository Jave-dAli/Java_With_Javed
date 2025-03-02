package BST;

class Node{
    int value;
    Node left, right;
    Node(int data){
        this.value = data;
        left = right = null;
    }
    public String toString(){
        return "Value="+this.value;
    }

}
public class BST {
    private int size;
    private Node root;
    BST(int capacity){
        int[] list = new int[capacity];
        size = 0;
    }
    BST(){
        root = null;
    }
    public void insert(int value){
        root = insertRec(root, value);
        size++;
    }

    // A recursive fun to insert a new key in BST.
    private Node insertRec(Node root, int value){
        // if tree is empty, return a new node.
        if(root == null) {
            return new Node(value);
        }
        // otherwise recur down the tree
        else if(value < root.value)
            root.left = insertRec(root.left, value);
        else if(value > root.value)
            root.right = insertRec(root.right, value);

        // Return the (unchanged) node pointer
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node root) {
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.value +" ");
            inorderRec(root.right);
        }
    }

    // this method deletes the key and returns the new root
    public Object delete(int key){
        var output = dltNode(root, key);
//        var output = dltNode(root, key);
        return output.value;
    }

    // following is from random utube video
    private Node dltNode(Node root, int key){
        if(root == null)
            return root;
        // recursive calls for ancestors of node to be deleted
        if(key < root.value)
            root.left = dltNode(root.left, key);
        else if(key > root.value)
            root.right = dltNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.value = minValue(root.right);
            root.right = dltNode(root.right, root.value);
        }
        return root;
    }



    private Node inorderSucc(Node right) {
        Node curr = root;
        while(curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }

    public Node search(int key){
        return searchNode(root, key);
    }
    private Node searchNode(Node root, int key){
        if(root == null || root.value == key)
            return root;
        if(key < root.value)
            return searchNode(root.left, key);
        else
            return searchNode(root.right, key);
    }
    private int minValue(Node node){
        int minv = node.value;
        while(node.left != null){
            minv = node.left.value;
            node = node.left;
        }
        return minv;
    }

}
