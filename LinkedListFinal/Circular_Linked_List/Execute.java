package LinkedListFinal.Circular_Linked_List;

public class Execute {
    public static void main(String[] args) {
        Exp1 list = new Exp1();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insert(4, 2);
        list.insertlast(7);
        list.deleteFirst();
        list.deleteLast();
        list.delete(1);
        list.display();
    }
}
