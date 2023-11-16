package DoubleLinkedList;

public class Sample {
    private Node head;
    private Node tail;
    private int size;

    public Sample() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);

        if(head==null){
            node.next = null;
        }
        else{
            head.previous = node;
            node.next = head;
        }
        head = node;
        size++;
    }
    
    
    private class Node {
        private int value;
        private Node next;
        private Node previous;

        // Constructor for private class Node
        public Node(int value) {
            this.value = value;
        }

        /*public Node(int value) {
            this.value = value;
            //this.previous = previous;
           // this.next = next;
            
        }*/
    }
}
