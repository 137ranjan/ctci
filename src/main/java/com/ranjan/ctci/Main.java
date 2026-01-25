package com.ranjan.ctci;

import com.ranjan.ctci.treesandgraphs.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 22, 23, 24};
        MinimalTree minimalTree = new MinimalTree();
        TreeNode root = minimalTree.createMinimalBST(sortedArray);
        TreeTraversals treeTraversals = new TreeTraversals();
        System.out.println("Preorder");
        treeTraversals.preOrderTraversal(root);
        System.out.println();
        System.out.println("Inorder");
        treeTraversals.inOrderTraversal(root);
        System.out.println();
        System.out.println("Postorder");
        treeTraversals.postOrderTraversal(root);
        System.out.println();

        List<LinkedList<TreeNode>> listOfDepths = new ListOfDepths().createLevelLinkedList(root);
        for (LinkedList<TreeNode> list : listOfDepths) {
            System.out.println();
            for (TreeNode node : list) {
                System.out.print(node.data + " ");
            }
        }

        System.out.println();
        CheckBalanced checkBalanced = new CheckBalanced();
        System.out.println(checkBalanced.isBalanced2(root));

        ValidateBST validateBST = new ValidateBST();
        System.out.println(validateBST.checkBST(root));
    }
}