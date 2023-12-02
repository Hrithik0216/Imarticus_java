package Tree_final.Binary_search_tree;

public class Demo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(38);
        // bst.insert(bst.root, 100);

        bst.insert(27);
        bst.insert(25);
        bst.insert(20);
        bst.insert(18);
        bst.insert(55);
        bst.insert(24);
        bst.insert(28);
        bst.insert(45);
        bst.insert(32);
        bst.insert(39);
        bst.insert(8);
        bst.insert(13);
        bst.insert(12);
        bst.insert(16);
        bst.insert(6);
        bst.insert(4);
        bst.insert(9);

        // System.out.println("The repeated elements are: ");
        // bst.findDup(bst.root);

        // System.out.println("Searching an element in the tree, ");
        // System.out.println(bst.search(bst.root,15));

        System.out.println("Postorder: ");
        bst.postOrder(bst.getRoot());

        System.out.println("Preorder: ");
        bst.preOrder(bst.getRoot());

        System.out.println("!!! In BST, inorder prints the tree elements in ascending order !!!");
        bst.inOrder(bst.getRoot());
    }
}
