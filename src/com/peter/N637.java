package com.peter;

import java.util.*;

public class N637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return res;
        }

        queue.offerLast(root);
        while (!queue.isEmpty()) {
            TreeNode peek = queue.peekFirst();

            int levelSize = queue.size();
            double levelSum = 0.0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = queue.pollFirst();
                levelSum += poll.val;
                if (poll.left != null) queue.addLast(poll.left);
                if (poll.right != null) queue.addLast(poll.right);
            }
            res.add(levelSum / levelSize);
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
