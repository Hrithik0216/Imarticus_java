package Tree_final.Binary_search_tree;

import java.util.ArrayList;
import java.util.HashSet;

public class BinarySearchTree {
   private Node root;
    
    

    private class Node {
        int key;
        Node right, left;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    //constructor
    public BinarySearchTree(int value) {
        this.root = new Node(value);
    }

    public BinarySearchTree() {
        this.root = null;
    }
    //encapsulation
    public void setRoot(Node root) {
        this.root = root;
    }
    public Node getRoot() {
        return root;
    }

    
    // Insertion
    public void insert(int value) {
        setRoot(insert(getRoot(), value));
    }
    private Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value > root.key) {
            root.right = insert(root.right, value);
        }else {
            // Handle duplicates by inserting them to the left
            root.left = insert(root.left, value);
        }

        return root;
    }

    // Searching
    public Node search(Node root, int value){
    if(root==null || value==root.key){
    return root;
    }
    if(value<root.key){
    return search(root.left,value);
    }else{
    return search(root.right, value);
    }
    }
    // public Boolean search(Node root, int value) {
    //     if (root == null) {
    //         return false;
    //     }
    //     if (root.key == value) {

    //         return true;
    //     } else {
    //         return search(root.left, value) || search(root.right, value);
    //     }
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

    public void postOrder(){
        postOrder(getRoot());
    }
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }

    public void preOrder(){
        preOrder(getRoot());
    }
    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //Find duplicates
    public void findDup(Node root){
        HashSet <Integer> set = new HashSet<>();
        ArrayList <Integer> list = new ArrayList<>();
        findDup(getRoot(),set,list);
        System.out.println(list);
    }
    private void findDup(Node root, HashSet <Integer> set,ArrayList <Integer> list ){
        if(root==null){
            return ;
        }
        findDup(root.left,set,list);
        System.out.println("Checking: " + root.key);
        // if(!set.contains(root.key)){
        //     list.add(root.key);
        //     set.add(root.key);
        // }else{
        //     set.add(root.key);
        // }
        if (!set.add(root.key)) {
            list.add(root.key);
        }
        findDup(root.right,set,list);
    }

}
