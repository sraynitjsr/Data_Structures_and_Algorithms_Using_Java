import java.util.Arrays;

public class PairwiseConsecutiveChecker {

    static boolean areElementsPairwiseConsecutive(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void start() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        if (areElementsPairwiseConsecutive(arr)) {
            System.out.println(Arrays.toString(arr) + " array elements are pairwise consecutive.");
        } else {
            System.out.println(Arrays.toString(arr) + " array elements are not pairwise consecutive.");
        }
    }
}
