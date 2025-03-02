class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right = null;
    }

}
public class BST {
    private int[] list;
    private int size;
    private Node root;
    BST(int capacity){
        list = new int[capacity];
        size = 0;
    }
    BST(){
        root = null;
    }
    public void insert(int data){
        root = insertRec(root, data);
        size++;
    }
    // iterative approach
//    public void insert(int data){
//        Node node = new Node(data);
//
//        if(root == null){
//            root = node;
//            return;
//        }
//
//        Node temp = root;
//        Node prev = null;
//        while(temp != null){
//            if(temp.data > data){
//                prev = temp;
//                temp = temp.left;
//            }
//            else if(temp.data < data){
//                prev = temp;
//                temp = temp.right;
//            }
//        }
//    }
    // A recursive fun to insert a new key in BST.
    private Node insertRec(Node root, int data){
        // if tree is empty, return a new node.
        if(root == null) {
            return root = new Node(data);
        }
        // otherwise recur down the tree
        else if(data < root.data)
            root.left = insertRec(root.left, data);
        else if(data > root.data)
            root.right = insertRec(root.right, data);

        // Return the (unchanged) node pointer
        return root;
    }


    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }

    // this method deletes the key and returns the new root
    public Node delete(int key){
        return deleteNode(root, key);
    }
    private Node deleteNode(Node root, int key){
        if(root == null)
            return root;
        // recursive calls for ancestors of node to be deleted
        if(key < root.data) {
            root.left = deleteNode(root.left, key);
            return root;
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
            return root;
        }

        // we reach here when root is the node to be deleted
        // if one of the children is empty
        if(root.left == null)
            return root.right;
        else if(root.right == null)
            return root.left;

        // if both children exist
        else{
            Node succParent = root;

            // find successor
            Node succ = root.right;
            while(succ.left != null){
                succParent = succ;
                succ = succ.left;
            }
            /*
            delete successor. Since succ is a/w left child of its parent, we can safely make successor's
            right right child as left of its parent. If there is no succ, then assign
            succ.right to succParent.right
             */
            if(succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;

            // copy succ data to root
            root.data = succ.data;
            return root;

        }

    }

    // following is from random utube video
    private Node dltNode(Node root, int key){
        if(root == null)
            return root;
        // recursive calls for ancestors of node to be deleted
        if(key < root.data)
            root.left = deleteNode(root.left, key);
        else if(key > root.data)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    // following is from ApnaCollege
    private Node apnadelete(Node root, int key){
        if(key < root.data)
            root.left = apnadelete(root.left, key);
        else if(key > root.data)
            root.right = apnadelete(root.right, key);
        else{
            if(root.left == null){
                Node temp = root.right;
                free(root);
                return temp;
            }
            else if(root.right == null){
                Node temp = root.left;
                free(root);
                return temp;
            }
            // case-3
            Node temp = inorderSucc(root.right);
            root.data = temp.data;
            root.right = apnadelete(root.right, temp.key);
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
        if(root == null || root.data == key)
            return root;
        if(key < root.data)
            return searchNode(root.left, key);
        else
            return searchNode(root.right, key);
    }
    private int minValue(Node node){
        int minv = node.data;
        while(node.left != null){
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

}
