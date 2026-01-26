package com.ranjan.ctci.treesandgraphs.firstcommonancestor;

import com.ranjan.ctci.treesandgraphs.TreeNode;

public class CommonAncestor1 {

    public TreeNode commonAncestor(TreeNode p, TreeNode q) {
        int delta = depth(p) - depth(q); // get difference in depths
        TreeNode first = delta > 0 ? q : p; // get shallower code
        TreeNode second = delta > 0 ? p : q; // get deeper nde
        second = goUpBy(second, Math.abs(delta)); // move deeper node up

        // Find where paths intersect
        while (first != second && first != null && second != null) {
            first = first.parent;
            second = second.parent;
        }

        return first == null || second == null ? null : first;
    }

    TreeNode goUpBy(TreeNode node, int delta) {
        while (delta > 0 && node != null) {
            node = node.parent;
            delta--;
        }
        return node;
    }

    private int depth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            node = node.parent;
            depth++;
        }
        return depth;
    }
}
