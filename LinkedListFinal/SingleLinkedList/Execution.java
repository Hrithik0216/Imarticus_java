package LinkedListFinal.SingleLinkedList;

public class Execution {
    public static void main(String[] args) {
        Exp list = new Exp();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insert(8,6);
        list.deleteLast();
        list.deleteFirst();
        list.delete(2);
        
        list.display();
    }
}
