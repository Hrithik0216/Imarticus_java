package Tree_final.Binary_search_tree;

import java.util.ArrayList;
import java.util.HashSet;

public class BinarySearchTree {
    private Node root;

    class Node {
        int key;
        Node right, left;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "Found the node " + key;
        }
    }

    // constructor
    public BinarySearchTree(int value) {
        this.root = new Node(value);
    }

    public BinarySearchTree() {
        this.root = null;
    }

    // encapsulation
    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    //Insertion
    public void insert(int value) {
        setRoot(insert(getRoot(), value));
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value > root.key) {
            root.right = insert(root.right, value);
        } else {
            // Handle duplicates by inserting them to the left
            root.left = insert(root.left, value);
        }

        return root;
    }
    //Error in LCA
        //Lowest common ancestor
        public Node lowestCommonAncestor(int p, int q) {
            return lowestCommonAncestor(getRoot(), new Node(p), new Node(q));
        }
    
        public Node lowestCommonAncestor(Node root, Node p, Node q) {
            //base case
            if(root == null || root.key == p.key || root.key == q.key){
                return root;
            }
            Node left = lowestCommonAncestor(root.left, p, q);
            Node right = lowestCommonAncestor(root.right, p, q);
    
            //result
            if(left==null){
                return right;
            }else if(right==null){
                return left;
            }else{
                return root;
            }
        }

    // Searching
    public Node search(Node root, int value) {
        if (root == null || value == root.key) {
            return root;
        }
        if (value < root.key) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }


    //Diameter
    public int dia(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDia = dia(root.left);
        int rightDia = dia(root.right);

        return Math.max(leftHeight+rightHeight+1, (Math.max(leftDia, rightDia)));
        

    }
    // Height of the node
    public int height(Node root) {
        if (root == null) {
            return 0;
        }

        
        int leftHeight = height(root.left);
        System.out.println(leftHeight);
        
        int rightHeight = height(root.right);
        System.out.println(rightHeight);
        
        return Math.max(leftHeight, rightHeight)+1;
    }
    // public Boolean search(Node root, int value) {
    // if (root == null) {
    // return false;
    // }
    // if (root.key == value) {

    // return true;
    // } else {
    // return search(root.left, value) || search(root.right, value);
    // }
    // }

    public void inOrder() {
        inOrder(getRoot());
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }

    public void postOrder() {
        postOrder(getRoot());
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }

    public void preOrder() {
        preOrder(getRoot());
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Find duplicates
    public void findDup(Node root) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        findDup(getRoot(), set, list);
        System.out.println(list);
    }

    private void findDup(Node root, HashSet<Integer> set, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        findDup(root.left, set, list);
        System.out.println("Checking: " + root.key);
        // if(!set.contains(root.key)){
        // list.add(root.key);
        // set.add(root.key);
        // }else{
        // set.add(root.key);
        // }
        if (!set.add(root.key)) {
            list.add(root.key);
        }
        findDup(root.right, set, list);
    }

}
