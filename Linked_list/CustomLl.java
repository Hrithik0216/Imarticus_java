package Linked_list;

public class CustomLl {

    private Node head;
    private Node tail;
    private int size;

    // Constructor for public class CustomLl
    public CustomLl() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value, head);// next reference of this new node is set to the current head.
        head = node;
        if (tail == null) {
            //If the tail is currently null, it means that the linked list is empty. 
            //In this case, the tail is updated to point to the same node as the head.
            tail = head; 
        }
        size += 1;
    }
    public void insertlast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail=node;
    }
    public void insert(int value, int index){
        if(index==size){
            insertlast(value);
            return;
        }
        if(index==0){
            insertFirst(value);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size ++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        // Constructor for private class Node
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
