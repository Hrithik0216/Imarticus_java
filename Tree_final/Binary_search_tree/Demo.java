package Tree_final.Binary_search_tree;

public class Demo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.insert(20);
        bst.insert(70);
        bst.insert(10);
        bst.insert(25);
        bst.insert(60);
        bst.insert(90);
        System.out.println("!!! In BST, inorder prints the tree elements in ascending order !!!");
        bst.inOrder(bst.root);

        System.out.println("Searching an element in the tree, ");
        if(bst.search(bst.root,20)==null){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found");
        }
        // System.out.println("Postorder: ");
        // bst.postOrder(bst.root);
        // System.out.println("Preorder: ");
        // bst.preOrder(bst.root);
    }
}
