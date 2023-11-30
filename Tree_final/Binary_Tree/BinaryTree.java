package Tree_final.Binary_Tree;

import java.util.ArrayList;
import java.util.HashSet;

public class BinaryTree {
    Node root;
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> list = new ArrayList<>();

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
    // Insertion
    // public void insertLeft(Node r, int value) {
    // Node newNode = new Node(value);
    // r.left = newNode;
    // }

    // public void insertRight(Node r, int value) {
    // Node newNode = new Node(value);
    // r.right = newNode;
    // }
    public void insertLeft(Node r, int value) {
        if (r != null) {
            Node newNode = new Node(value);
            r.left = newNode;
        } else {
            System.out.println("Cannot insert left child to a null node.");
        }
    }

    public void insertRight(Node r, int value) {
        if (r != null) {
            Node newNode = new Node(value);
            r.right = newNode;
        } else {
            System.out.println("Cannot insert right child to a null node.");
        }
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

    // Search
    public Boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.data == value) {

            return true;
        } else {
            return search(root.left, value) || search(root.right, value);
        }
    }
    // find dup
    // public void findDup(Node root){
    // if(root==null){
    // return;
    // }
    // findDup(root.left);
    // if(root!=null){
    // findDup(root.left);
    // if(set.contains(root.data)){
    // list.add(root.data);
    // }else{
    // set.add(root.data);
    // }
    // findDup(root.right);
    // }

    // }
    public void findDup(Node root) {
        if (root == null) {
            return;
        }
        findDup(root.left);
        if (root != null) {
            findDup(root.right); 
            if (set.contains(root.data)) {
                list.add(root.data);
            } else {
                set.add(root.data);
            }
        }
    }

    public static Node Node(int i) {
        return null;
    }
}
