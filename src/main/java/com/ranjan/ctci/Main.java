package com.ranjan.ctci;

import com.ranjan.ctci.treesandgraphs.TreeNode;
import com.ranjan.ctci.treesandgraphs.TreeTraversals;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.inOrderTraversal(root);
        System.out.println();
        treeTraversals.preOrderTraversal(root);
        System.out.println();
        treeTraversals.postOrderTraversal(root);
    }
}
