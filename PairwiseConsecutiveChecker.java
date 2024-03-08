import java.util.HashSet;

public class PairwiseConsecutiveChecker {

    static boolean areElementsPairwiseConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (max - min + 1 != arr.length) {
            return false;
        }

        return true;
    }

    public static void start() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        if (areElementsPairwiseConsecutive(arr)) {
            System.out.println("Array elements are pairwise consecutive.");
        } else {
            System.out.println("Array elements are not pairwise consecutive.");
        }
    }
}
