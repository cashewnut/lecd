package leetcode;

public class No110 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int depth(TreeNode node) {
		if (node == null)
			return 0;
		return Math.max(depth(node.left), depth(node.right)) + 1;
	}

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
	}

	public int dfs(TreeNode node) {
		if (node == null)
			return 0;
		int left = dfs(node.left);
		int right = dfs(node.right);
		if (left == -1)
			return -1;
		if (right == -1)
			return -1;
		if (Math.abs(left - right) > 1)
			return -1;
		return Math.max(left, right) + 1;
	}

	public boolean isBalanced2(TreeNode root) {
		if(root == null)
			return true;
		return dfs(root) != -1;
	}

}
