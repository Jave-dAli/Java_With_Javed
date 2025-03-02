package BST;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(45);

        // Print inorder traversal of the BST
        tree.inorder();
        System.out.println(tree.delete(45));
        tree.inorder();
//        System.out.println(tree.delete(70));
//        tree.inorder();

    }
}
