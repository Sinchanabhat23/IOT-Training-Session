package DSA.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<String>();
        actions.addLast("User Types A");
        actions.addLast("User Types B");
        actions.addLast("User deletes B");
        System.out.println("Undo:"+actions.removeLast()); // removeLast removes last element added to the deque
        System.out.println("Remaining actions:"+actions);
    }
}


