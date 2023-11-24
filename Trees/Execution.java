package Trees;

import Trees.Example.*;

public class Execution {
    public static void main(String[] args) {

        Example tree = new Example();
        tree.insertAll();

        // tree.PreOrder(tree.ob);
        // Traversal t = new Traversal(tree.ob);
        tree.inOrder(tree.ob);
        System.out.println("-------------------");
        tree.PostOrder(tree.ob);
    }
}
