package AVL;

public class AVL {
    private Node root;
    AVL(){
        root = null;
    }
    public void insert(int value){
        root = insert(root, value);
    }
    //           10
    //      null    null
    private Node insertt(Node root, int value){
        if(root == null)
            return new Node(value);
        if(value < root.element)
            root.left = insertt(root.left, value);
        else
            root.right = insertt(root.right, value);
        return root;
    }
    private Node insert(Node node, int element){
        // check whether the node is null or not
        if(node == null){
            node = new Node(element);
        }
        // insert a node in case when the given element is lesser than the element of the root node
        else if(element < node.element){
            node.left = insert(node.left, element);
            if(getHeight(node.left) - getHeight(node.right) == 2){
                if(element < node.left.element)
                    node = rotateWithLeftChild(node);
                else
                    node = doubleWithLeftChld(node);
            }
        }
        else if(element > node.element){
            node.right = insert(node.right, element);
            if(element > node.right.element)
                node = rotateWithRightChild(node);
            else
                node = doubleWithRightChild(node);
        }
        else{
            // if the element is already present in the tree, we do nothing
            node.height = getMaxHeight(getHeight(node.left), getHeight(node.right))+1;
        }
        return node;
    }

    private Node rotateWithLeftChild(Node node2) {
        Node node1 = node2.left;
        node2.left = node1.right;
        node1.right = node2;
        node2.height = getMaxHeight(getHeight(node2.left), getHeight(node2.right))+1;
        node1.height = getMaxHeight(getHeight(node1.left), node2.height)+1;
        return node1;
    }
    private Node rotateWithRightChild(Node node1){
        Node node2 = node1.right;
        node1.right = node2.left;
        node2.left = node1;
        node1.height = getMaxHeight(getHeight(node1.left), getHeight(node1.right))+1;
        node2.height = getMaxHeight(getHeight(node2.right), node1.height)+1;
        return node2;
    }

    // create doubleWithLeftChild() method to perform double rotation of binary tree node.
    // This method 1st rotate the left child with its right child, then node3 with the new left child.
    private Node doubleWithLeftChld(Node node3){
        node3.left = rotateWithRightChild(node3.left);
        return rotateWithLeftChild(node3);
    }

    //create doubleWithRightChild() method to perform double rotation of binary tree node. This method
    //first rotate the right child with its left child and after that node1 with the new right child
    private Node doubleWithRightChild(Node node1){
        node1.right = rotateWithLeftChild(node1.right);
        return rotateWithRightChild(node1);
    }

    // Following method returns the height of the AVL tree
    private int getHeight(Node node){
        return node == null ? -1 : node.height;
    }
    public int getTotalNoOfNodes(){
        return getTotalNoOfNodes(root);
    }
    private int getTotalNoOfNodes(Node head){
        if(head == null)
            return 0;
        else{
            int length = 1;
            length = length+getTotalNoOfNodes(head.left);
            length = length+getTotalNoOfNodes(head.right);
        }
        return head.element;
    }
    public boolean searchElement(int element){
        return searchElement(root, element);
    }
    private boolean searchElement(Node head, int element){
        boolean check = false;
        while((head != null) && !check){
            int headElement = head.element;
            if(element < headElement)
                head = head.left;
            else if(element > headElement)
                head = head.right;
            else{
                check = true;
                break;
            }
            check = searchElement(head, element);
        }
        return check;
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node head){
        if(head != null){
            inorder(head.left);
            System.out.print(head.element+" ");
            inorder(head.right);
        }
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node head){
        if(head != null){
            System.out.print(head.element+" ");
            preorder(head.left);
            preorder(head.right);
        }
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node head){
        if(head != null){
            postorder(head.left);
            postorder(head.right);
            System.out.print(head.element+" ");
        }
    }

    // Following method returns the maximum height from left and right node
    private int getMaxHeight(int leftNodeHeight, int rightNodeHeight){
        return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;
    }
    public void removeAll(){
        root = null;
    }
    public boolean checkEmpty(){
        return root == null;
    }
}
