public class MyWordWrap {
    private static int calculateCost(int[] words, int start, int end, int maxWidth) {
        int totalWidth = 0;
        for (int i = start; i <= end; i++) {
            totalWidth += words[i];
        }
        int remainingSpace = maxWidth - (end - start) - totalWidth;
        return remainingSpace * remainingSpace;
    }
    private static int minCostWordWrap(int[] words, int maxWidth) {
        int n = words.length;
        int[] cost = new int[n];
        cost[0] = calculateCost(words, 0, 0, maxWidth);
        for (int i = 1; i < n; i++) {
            cost[i] = Integer.MAX_VALUE;
            for (int j = i; j >= 0; j--) {
                int currentCost = (j > 0 ? cost[j - 1] : 0) + calculateCost(words, j, i, maxWidth);
                if (currentCost < cost[i]) {
                    cost[i] = currentCost;
                }
            }
        }
        return cost[n - 1];
    }
    public static void start() {
        int[] words = { 3, 2, 2, 5, 4, 7, 1 };
        int maxWidth = 6;
        int minCost = minCostWordWrap(words, maxWidth);
        System.out.println("Minimum cost of word wrap => " + minCost);
    }
}
