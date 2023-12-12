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

    // insert last
    public void inserLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            insertFirst(value);
            return;
        } else {

            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size += 1;
    }

    // Sorting a a doubly linkedList
    public void sortList() {
        Node current = null, index = null;
        int temp;
        if (head == null) {
            System.out.println("Empty list");
        }
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index.next != null; index = index.next) {
                if (current.value > index.value) {
                    temp = current.value;
                    current.value = index.value;
                    index.value = temp;
                }
            }

        }

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
        public int data;
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

