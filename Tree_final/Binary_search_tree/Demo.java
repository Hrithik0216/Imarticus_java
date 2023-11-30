package Tree_final.Binary_search_tree;

public class Demo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(7);
        //bst.insert(bst.root, 100);
        
        bst.insert(16);
        bst.insert(12);
        bst.insert(17);
        bst.insert(19);
        bst.insert(7);
        bst.insert(8);
        bst.insert(12);
        bst.insert(31);
        bst.insert(29);
        bst.insert(6);
        bst.insert(17);
        bst.insert(11);

        System.out.println("The repeated elements are: ");
        bst.findDup(bst.root);
        
        
     

        // System.out.println("Searching an element in the tree, ");
        // System.out.println(bst.search(bst.root,15));
        

       



        // System.out.println("Postorder: ");
        // bst.postOrder(bst.root);
        // System.out.println("Preorder: ");
        // bst.preOrder(bst.root);

           // System.out.println("!!! In BST, inorder prints the tree elements in ascending order !!!");
        // bst.inOrder(bst.root);

        
    }

   
}
