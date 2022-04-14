package com.peter.Tree;

public class IsBalancedTree {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) == -1 ? false : true;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = getHeight(node.right);
        if (rightHeight == -1) return -1;

        int result;
        if (Math.abs(leftHeight - rightHeight) > 1) {
            result = -1;
        } else {
            result = 1 + Math.max(leftHeight, rightHeight);
        }
        return result;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
