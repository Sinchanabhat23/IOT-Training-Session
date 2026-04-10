package DSA.nonlinear.heaps;
import java.util.PriorityQueue;
import java.util.Collections;

public class KthSmallestElement {
    public static void main(String[] args) {

        int[] arr = {19, 21, 4, 9, 3, 7};
        int k = 3;

        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.offer(num);

            // Keep only k smallest elements
            if (maxHeap.size() > k) {
                maxHeap.poll(); // removes largest
            }
        }

        // Top of heap = kth smallest
        System.out.println("Kth Smallest Element: " + maxHeap.peek());
    }
}

