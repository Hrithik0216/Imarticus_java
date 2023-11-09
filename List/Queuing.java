package List;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuing {
    public static void main(String[] args) {
        PriorityQueue <String> q = new PriorityQueue<>();
        q.add("Hrithik");
        q.add("Arun");
        q.add("Kumar");
        q.add("Shan");
        for(String i: q){
            System.out.println(i);
        }
        System.out.println("Removed "+ q.peek());
        System.out.println("Removed "+ q.size());
        System.out.println("Removed "+ q.poll());
    }
}
