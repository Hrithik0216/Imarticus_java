package Queue;

public class SingleLLExecu {
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        list.offer(4);
        list.offer(5);
        list.display();
        System.out.println(list.getSize());
        list.poll();
        list.display();
        System.out.println(list.getSize());


    }
}
