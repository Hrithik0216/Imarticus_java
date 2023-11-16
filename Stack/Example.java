package Stack;

import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(111);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.add(1, 11);
        stack.add(55);
        System.out.println(stack.elementAt(2));
        stack.addFirst(0);
        stack.pop();
        System.out.println(stack.hashCode());
        System.out.println(stack);
        System.out.println(stack.capacity());
        System.out.println(stack.indexOf(7));
        
    }
}
