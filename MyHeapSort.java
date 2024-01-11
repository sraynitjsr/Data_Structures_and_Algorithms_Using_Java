import java.util.Collections;
import java.util.PriorityQueue;

public class MyHeapSort {
    public static void start() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int[] elements = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        for (int element : elements) {
            minHeap.add(element);
            maxHeap.add(element);
        }
        System.out.print("Ascending Ordered Data => ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
        System.out.print("Descending Ordered Data => ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
