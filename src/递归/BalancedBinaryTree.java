package 递归;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static int getHeight(TreeNode antherRoot) {
        if (antherRoot == null) {
            return 0;
        } else {
            return Math.max(getHeight(antherRoot.left), getHeight(antherRoot.right)) + 1;
        }
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

