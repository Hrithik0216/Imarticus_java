package Queue;

public class SingleLL {
    private Node head;
    private Node tail;
    private int size;

   /* public SingleLL() {
        this.size = 0;
    }*/
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    // Insertion
    // Insert First
    public void offer(int value) {
        Node node = new Node();
        node.setValue(value);
        if (tail == null) {
            tail = head;
        }
        node.next = head;
        head = node;
        size += 1;
    }
    //Deletion
    //Delete first
    public void poll(){
        //head = head.value;
         Node temp = head;
         Node newTemp = head;
        while (temp != null) {
            newTemp = temp.next;
            if (newTemp.getNext() == null) {
                tail = temp;
                tail.setNext(null);
            }
            temp = temp.next;

        }
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

        /*public Node(int value) {
            this.value = value;
        }*/

       /*  public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }*/
        public Node() {
            this.value = 0;
            this.next = null;
        }

        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value = value;
        }

        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next = next;
        }
    }
}
