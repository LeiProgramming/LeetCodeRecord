package com.peter.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();

        if (root == null) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        traversal(root, path, res);
        return res;
    }

    private void traversal(TreeNode cur, List<Integer> path, List<String> res) {
        path.add(cur.val);
        if (cur.left == null && cur.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i));
                sb.append("->");
            }
            sb.append(path.get(path.size() - 1));
            res.add(sb.toString());
            return;
        }
        if (cur.left != null) {
            traversal(cur.left, path, res);
            path.remove(path.size() - 1);
        }
        if (cur.right != null) {
            traversal(cur.right, path, res);
            path.remove(path.size() - 1);
        }
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
