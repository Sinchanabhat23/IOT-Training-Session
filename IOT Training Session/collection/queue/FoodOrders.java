package DSA.collection.queue;

import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders {
    public static void main(String[] args) {
      Queue<String> orders = new LinkedList<>();
      // From adding -add() [fail][strict],offer()[not fail][not strict]
      orders.add("Order 104"); // strict capacity based
      orders.offer("Order 106"); // flexible
        System.out.println("Orders:"+orders);
        // for removal:remove();-> Strict[Fail] poll() Not strict[NotFail]
        System.out.println("Serving:"+orders.remove());
        System.out.println("Orders:"+orders);
        System.out.println("Pending orders:"+orders);
        System.out.println("Orders:"+orders.poll());
        System.out.println("Orders:"+orders);
    }
}
// add-> even if the queue is full it tries to add the element and then throws an exception
// offer-> if the queue is full it gracefully returns true if the element is added else it return false if the element is not added
// instead of throwing an exception it simply returns true or false
