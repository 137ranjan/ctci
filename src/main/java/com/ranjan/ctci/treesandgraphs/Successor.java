package com.ranjan.ctci.treesandgraphs;

public class Successor {

    public TreeNode inorderSuccessor(TreeNode node) {
        if (node == null) {
            return null;
        }

        // Found right children -> return leftmost node of right subtree
        if (node.right != null) {
            return leftMostChild(node.right);
        } else {
            TreeNode currNode = node;
            TreeNode parent = node.parent;
            // Go up until we're on left instead of right
            while (parent != null && parent.left != currNode) {
                currNode = parent;
                parent = currNode.parent;
            }
            return parent;
        }
    }

    private TreeNode leftMostChild(TreeNode node) {
        if (node == null) {
            return null;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
