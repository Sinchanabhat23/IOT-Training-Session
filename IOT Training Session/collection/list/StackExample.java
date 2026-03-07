package DSA.collection.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek()); // displays top element
        System.out.println(stack);
        stack.pop(); // remove top element
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.isEmpty()); // returns true or false
        System.out.println(stack);
    }
}