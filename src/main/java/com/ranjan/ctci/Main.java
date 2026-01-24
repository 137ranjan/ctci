package com.ranjan.ctci;

import com.ranjan.ctci.treesandgraphs.MinimalTree;
import com.ranjan.ctci.treesandgraphs.TreeNode;
import com.ranjan.ctci.treesandgraphs.TreeTraversals;

public class Main {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20};
        MinimalTree minimalTree = new MinimalTree();
        TreeNode root = minimalTree.createMinimalBST(sortedArray);
        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.inOrderTraversal(root);
        System.out.println();
        treeTraversals.postOrderTraversal(root);
    }
}