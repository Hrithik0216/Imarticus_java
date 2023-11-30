package Tree_final.Binary_Tree;

public class Demo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(38);
        tree.insertLeft(tree.root,27);
        tree.insertRight(tree.root, 25);

        tree.insertLeft(tree.root.left, 20);
        tree.insertRight(tree.root.left, 18);
        tree.insertLeft(tree.root.left.left, 12);
        tree.insertRight(tree.root.left.left, 12);

        tree.insertLeft(tree.root.right, 7);
        tree.insertRight(tree.root.right, 16);
        tree.insertLeft(tree.root.right.right.left, 17);
        tree.insertLeft(tree.root.right.right.left, 15);
        tree.insertLeft(tree.root.right.right.right, 15);

        //System.out.println(tree.search(tree.root, 11));

        tree.findDup(tree.root);
        System.out.println(tree.list);

        // System.out.println("The preorder is: ");
        // tree.preOrder(tree.root);

        // System.out.println("The postorder is: ");
        // tree.postOrder(tree.root);

        // System.out.println("The Inorder is: ");
        // tree.inOrder(tree.root);

    }
}
