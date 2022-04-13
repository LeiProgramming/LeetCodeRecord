package com.peter;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return res;
        }
        queue.offerLast(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode pool = queue.peekFirst();

                if (pool.left != null) {
                    queue.addLast(pool.left);
                }
                if (pool.right != null) {
                    queue.addLast(pool.right);
                }

                if (i == levelSize - 1) {
                    res.add(pool.val);
                }
            }
        }
        return res;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
