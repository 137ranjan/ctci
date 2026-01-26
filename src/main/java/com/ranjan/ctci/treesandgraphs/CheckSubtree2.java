package com.ranjan.ctci.treesandgraphs;

public class CheckSubtree2 {

    public boolean containsTree(TreeNode t1, TreeNode t2) {
        if (t2 == null) return true;
        return subtree(t1, t2);
    }

    private boolean subtree(TreeNode r1, TreeNode r2) {
        if (r1 == null) {
            return false;
        } else if (r1.data == r2.data && matchTree(r1, r2)) {
            return true;
        }
        return subtree(r1.left, r2) || subtree(r1.right, r2);
    }

    private boolean matchTree(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        } else if (r1 == null || r2 == null) {
            return false;
        } else if (r1.data != r2.data) {
            return false;
        } else {
            return matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right);
        }
    }
}
