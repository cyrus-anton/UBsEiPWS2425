public class BinarySearchTree {
    public int value;
    public BinarySearchTree left;
    public BinarySearchTree right;

    BinarySearchTree(int value) {
        this.value = value;
    }

    public static void printNodes(BinarySearchTree root) {
        /* if (root.left != null) {
            printNodes(root.left);
        }
        if (root != null) {
            System.out.println(root.value + ", ");
        }
        if (root.right!= null) {
            printNodes(root.right);
        }
        */

        if (root == null)
            return;
        printNodes(root.left);
        System.out.print(root.value + ", ");
        printNodes(root.right);

    }
}
