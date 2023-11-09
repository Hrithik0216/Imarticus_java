package Linked_list;

import java.util.LinkedList;

public class InternalLl {
    public static void main(String[] args) {
        CustomLl list = new CustomLl(); //The CustomLl file shows how the LinkedList wo rks
        //LinkedList <Integer> list = new LinkedList<>();
        //list.add(20);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertlast(25);
        list.insert(100, 3);
        list.display();
    }
}
