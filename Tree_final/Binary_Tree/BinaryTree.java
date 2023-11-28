package Tree_final.Binary_Tree;

public class BinaryTree {
    Node root;

    class Node {
        int data;
        Node left, right;

        public Node(int value) {
            this.data = value;
            this.right = null;
            this.left = null;
        }
    }

    public BinaryTree(int value) {
        this.root = new Node(value);// For memory allocation of new Node to root //while passing value to this the
                                    // Node constructor is called
    }

    public void insertLeft(Node r, int value) {
        Node newNode = new Node(value);
        r.left = newNode;
    }

    public void insertRight(Node r, int value) {
        Node newNode = new Node(value);
        r.right = newNode;
    }

    // Traversal
    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    public void postOrder(Node root) { 
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

}
