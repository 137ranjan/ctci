package com.ranjan.ctci.treesandgraphs;

public class CheckBalanced {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public boolean isBalanced2(TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight);
        }
    }
}
