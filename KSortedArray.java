import java.util.PriorityQueue;

public class KSortedArray {

    public static void kSort(int[] arr, int k) {
        int n = arr.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i <= k && i < n; i++) {
            minHeap.offer(arr[i]);
        }

        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = minHeap.poll();

            minHeap.offer(arr[i]);
        }
        
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void start() {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        System.out.println("Original array:");
        printArray(arr);

        kSort(arr, k);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
