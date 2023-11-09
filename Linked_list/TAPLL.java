package Linked_list;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void Print(){
        Node curr = head; //or this.head
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

public class TAPLL {
    //Using method in the main class is not a best practice. So,
    /*static void PrintLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }*/

    public static void main(String[] args) {
        //create object for the class LinkeList
        LinkedList ll = new LinkedList();
        
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        //Node head = p1; // Local variable is passed to the method Print LinkedList
        ll.head = p1; //for the class LinkedList
        ll.Print();
        /*
         * System.out.println(p1.next = p2);
         * System.out.println(p1.next);
         * System.out.println(p2.next);
         * System.out.println(p3.next);
         * System.out.println(p4.next);
         * 
         * System.out.println(p1.data);
         * System.out.println(p2.data);
         * System.out.println(p3.data);
         * System.out.println(p4.data);
         */

    }
}
