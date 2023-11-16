package LinkedListFinal.SingleLinkedList;

public class Exp {
    private Node head;
    private Node tail;
    private int size;

    public Exp() {
        this.size = 0;
    }

    // Insertion
    // Insert First
    public void insertFirst(int value) {
        Node node = new Node(value);
        if (tail == null) {
            tail = head;
        }
        node.next = head;
        head = node;
        size += 1;
    }

    // insert Last
    public void insertlast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    // insert
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size - 1) {
            insertlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;
    }

    //Deletion
    //Delete first
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
            size--;
        }
        return val;
    }

    //get index value as node
    public Node get(int index){
        Node node = head;
        for(int i =0; i<index;i++){
            node = node.next;
        }
        return node;
    }

    //Delete last
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    //delete
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
