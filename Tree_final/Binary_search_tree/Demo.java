package Tree_final.Binary_search_tree;

public class Demo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(10);
        // bst.insert(bst.root, 100);

        bst.insert(9);
        bst.insert(8);
        bst.insert(7);
        bst.insert(11);
        // bst.insert(12);
        // bst.insert(13);
        // bst.insert(14);
       
        

        // System.out.println("The repeated elements are: ");
        // bst.findDup(bst.root);

        // System.out.println("Searching an element in the tree, ");
        // System.out.println(bst.search(bst.getRoot(),12));
        System.out.println(bst.height(bst.getRoot()));
        

        // System.out.println("Postorder: ");
        // bst.postOrder(bst.getRoot());

        // System.out.println("Preorder: ");
        // bst.preOrder(bst.getRoot());

        // System.out.println("!!! In BST, inorder prints the tree elements in ascending order !!!");
        // bst.inOrder(bst.getRoot());
    }
}
