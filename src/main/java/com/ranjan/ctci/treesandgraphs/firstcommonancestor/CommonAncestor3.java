package com.ranjan.ctci.treesandgraphs.firstcommonancestor;

import com.ranjan.ctci.treesandgraphs.TreeNode;

public class CommonAncestor3 {

    public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // error check - one node is not in the tree
        if (!covers(root, p) || !covers(root, q)) {
            return null;
        }
        return ancestorHelper(root, p, q);
    }

    private TreeNode ancestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        boolean pIsOnLeft = covers(root.left, p);
        boolean qIsOnLeft = covers(root.left, p);
        if (pIsOnLeft != qIsOnLeft) {
            return root;
        }
        TreeNode childSide = pIsOnLeft ? root.left : root.right;
        return ancestorHelper(childSide, p, q);
    }

    private boolean covers(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return covers(root.left, node) || covers(root.right, node);
    }
}
