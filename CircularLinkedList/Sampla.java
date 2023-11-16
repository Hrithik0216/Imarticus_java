package CircularLinkedList;

public class Sampla {
    private Node head;
    private Node tail;
    private int size;

    // Constructor for public class CustomLl
    public Sampla() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value,null);// next reference of this new node is set to the current head.
    
        if (head == null) {
            //If the tail is currently null, it means that the linked list is empty. 
            //In this case, the tail is updated to point to the same node as the head.
            head = node;
            tail = node;
            tail.next = head; 
        }else{
            node.next = head;
            head = node;
            tail.next = head;
        }
        size += 1;
    }
    public void insertlast(int value){
        if(tail==head){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = head;
        tail=node;
    }
   

    public void display(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node curr = head;

        do{
            System.out.print(curr.value+" -> ");
            curr=curr.next;
        }while(curr!=head);{
            System.out.println("End");
        }
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
