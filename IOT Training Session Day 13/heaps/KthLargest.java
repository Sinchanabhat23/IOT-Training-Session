package DSA.nonlinear.heaps;
import java.util.PriorityQueue;
public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {19, 21, 4, 9, 3, 7};
        int k = 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {  // if size becomes more than k
                minHeap.poll(); //  removes smallest element
            }
        }
        System.out.println("Kth largest = " + minHeap.peek());
    }
}