import java.util.PriorityQueue;
public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }     
        return minHeap.poll();
    }
    public static void start() {
        int[] nums = {3, 1, 4, 2, 2, 5, 6};
        int k = 3;
        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is => " + result);
    }
}
