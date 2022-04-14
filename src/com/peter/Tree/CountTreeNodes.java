package com.peter.Tree;

public class CountTreeNodes {
    public int countNodes(TreeNode root) {
        TreeNode left = root, right = root;
        int h1 = 0, h2 = 0;
        while (left != null) {
            left = left.left;
            h1++;
        }
        while (right != null) {
            right = right.right;
            h2++;
        }
        if (h1 == h2) {
            return (int) Math.pow(2, h1) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
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
