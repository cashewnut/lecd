public class MinimumDepthTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int run(TreeNode root) {
        if (root == null)
            return 0;
        int left = run(root.left), right = run(root.right);
        if (left == 0 && right == 0)
            return 1;
        if (left == 0)
            return 1 + right;
        else if (right == 0)
            return 1 + left;
        else
            return Math.min(left, right) + 1;
    }

}

