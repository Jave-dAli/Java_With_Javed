package AVL;
public class AVLTree {
    private class Node{
        int value;
        private int height;
        Node left, right;
        public Node(int value){
            this.value = value;
        }
        public String toString(){
            return "Value="+this.value;
        }
    }
    private Node root;
    public void insert(int value){
        root = insert(root, value);
    }
    //           10
    //      null    null
    private Node insert(Node root, int value){
        if(root == null)
            return new Node(value);
        if(value < root.value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);
        setHeight(root);

        return balance(root);
        // balanceFactor = height(L) - height(R)
        // 5 - 3 = 2
    }
    private Node balance(Node root){
//        var balanceFactor = balanceFactor(root);  delete this line when studying rotations
        if(isLeftHeavy(root)) {
            if (balanceFactor(root.left) < 0)
                root.left = rotateLeft(root.left);
//                System.out.println("Left Rotate " + root.left.value);
            return rotateRight(root);
//            System.out.println("Right Rotate "+root.value);
        }
        else if(isRightHeavy(root)){
            if(balanceFactor(root.right) > 0)
                root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }
    private Node rotateLeft(Node root){
        var newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;

        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }
    private Node rotateRight(Node root){
        var newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }
    private void setHeight(Node node){
        node.height = Math.max(height(node.left), height(node.right))+1;
    }
    private boolean isLeftHeavy(Node node){
        return balanceFactor(node) > 1;
    }
    private boolean isRightHeavy(Node node){
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(Node node){
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private int height(Node node){
        return (node == null) ? -1 : node.height;
    }
}