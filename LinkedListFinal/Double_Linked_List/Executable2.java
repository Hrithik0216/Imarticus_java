package LinkedListFinal.Double_Linked_List;

public class Executable2 {
    public static void main(String[] args) {
        Exp2 list = new Exp2();
        list.insertFirst(25);
        list.insertFirst(30);
        list.insertFirst(35);
        list.insertFirst(40);
        list.insertFirst(45);
        list.inserLast(77);
        list.inserLast(78);
        // list.display();
        list.sortList();
        System.out.println("Sorted List: ");
        list.display();
        //list.displayRev();

    }
}
