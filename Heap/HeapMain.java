package Heap;

public class HeapMain {
    public static void main(String[] args) {
        HeapLogic heapLogic = new HeapLogic(8);
        heapLogic.insert(21);
        heapLogic.insert(17);
        heapLogic.insert(12);
        heapLogic.insert(19);
        heapLogic.insert(15);
        heapLogic.insert(18);
        heapLogic.insert(13);
        
        heapLogic.display();
    }
}
