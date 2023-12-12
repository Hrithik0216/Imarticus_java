package Tree_final.Binary_search_tree;
import Tree_final.Binary_search_tree.BinarySearchTree;
public class Demo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(1);
        bst.insert(2);
        bst.insert(8);
        bst.insert(10);
      
    //    System.out.println(bst.lowestCommonAncestor(1, 2));
          
        
        // if (lca != null) {
        //     System.out.println("Lowest common ancestor is " + lca.key);
        // } else {
        //     System.out.println("No common ancestor found");
        // }

        // System.out.println("The repeated elements are: ");
        // bst.findDup(bst.root);

        // System.out.println("Searching an element in the tree, ");
        // System.out.println(bst.search(bst.getRoot(),12));
        //System.out.println(bst.height(bst.getRoot()));
        

        // System.out.println("Postorder: ");
        // bst.inOrder(bst.getRoot());

        // System.out.println("Preorder: ");
        // bst.preOrder(bst.getRoot());

        // System.out.println("!!! In BST, inorder prints the tree elements in ascending order !!!");
        // bst.inOrder(bst.getRoot());
    }
}
