package com.ranjan.ctci.treesandgraphs;

public class ValidateBST {

    public boolean checkBST(TreeNode root) {
        return checkBST(root, null, null);
    }

    private boolean checkBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.data <= min) || (max != null && node.data > max)) {
            return false;
        }

        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
    }
}
