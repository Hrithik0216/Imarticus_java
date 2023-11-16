package LinkedListFinal.Double_Linked_List;

import LinkedListFinal.SingleLinkedList.Exp;

public class Exp2 {
    private Node head;
    private Node tail;
    private int data;
    private int size;

    public Exp2() {
        this.size = 0;
    }

    // Insertion
    // Insert First
    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            // head.next = null;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }

        size += 1;
    }

    // Display
    public void displayRev() {

        Node curr = tail;
        while (curr != null) {
            if (curr != null) {
                System.out.print(curr.value + " --> ");
            }
            curr = curr.prev;
        }
        System.out.println("END");
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " --> ");
            curr = curr.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

}
