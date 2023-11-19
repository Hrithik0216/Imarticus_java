package KunalOOPS;

public class Child extends Parent {
    public Child(int size) {
        super();
    }

    // insert Firt
    @Override
    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = node;
            size += 1;
        }
    }
    //insert last
    @Override
    public void insertlast(int value) {
        Node node = new Node(value);
        if (tail == head) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size += 1;
    }

    // insert
    @Override
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

    // Deletion
    // Delete first
    @Override
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
            size--;
        }
        return val;
    }

    // get index value as node
    @Override
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Delete last
    @Override
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 1);
        int val = tail.value;
        tail = secondLast;
        tail.next = head;
        return val;
    }

    // delete
    @Override
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    @Override
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        } while (temp != head);
        {
            System.out.println("END");
        }
    }

    public class ChildNode extends Node {

        public ChildNode(int value) {
            super(value);
        }

        public ChildNode(int value, Node next) {
            super(value, next);
        }
    }

    public static void main(String[] args) {
        Child ob1 = new Child(size);
        ob1.insertFirst(25);
        ob1.insertlast(5);
        ob1.insert(4, 2);
        ob1.display();
    }
}
