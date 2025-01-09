public class BinarySearchTreeApplication {

    public static void main(String[] args) {

        BinarySearchTree b = new BinarySearchTree(45);
        b.left = new BinarySearchTree(13);
        b.right = new BinarySearchTree(100);

        b.left.left = new BinarySearchTree(9);
        b.left.right = new BinarySearchTree(26);

        b.right.left = new BinarySearchTree(94);
        b.right.right = new BinarySearchTree(102);

        b.right.left.left = new BinarySearchTree(63);

        BinarySearchTree.printNodes(b);


    }
}
