package Queue;

import java.util.LinkedList;
import java.util.Queue;



public class Example {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(25);
        queue.offer(35);
        queue.offer(45);
        queue.offer(55);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
       System.out.println( queue.element());
       System.out.println(queue.getClass());
    }
}
