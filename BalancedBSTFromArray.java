class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BalancedBSTFromArray {
    private TreeNode root;

    public BalancedBSTFromArray() {
        this.root = null;
    }

    public static void start() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        BalancedBSTFromArray bstFromArray = new BalancedBSTFromArray();
        bstFromArray.root = bstFromArray.sortedArrayToBST(nums, 0, nums.length - 1);
        System.out.println("Balanced BST:");
        bstFromArray.inorderTraversal(bstFromArray.root);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, end);
        
        return node;
    }
    
    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }
}
