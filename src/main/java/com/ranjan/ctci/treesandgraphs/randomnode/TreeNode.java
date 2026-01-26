package com.ranjan.ctci.treesandgraphs.randomnode;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int data;
    public int size = 0;

    public TreeNode(int data) {
        this.data = data;
        size = 1;
    }

    public TreeNode getIthNode(int i) {
        int leftSize = left == null ? 0 : left.size();
        if (i < leftSize) {
            return left.getIthNode(i);
        } else if (i == leftSize) {
            return this;
        } else {
            return right.getIthNode(i - (leftSize + 1));
        }
    }

    public void insertInOrder(int d) {
        if (d <= data) {
            if (left == null) {
                left = new TreeNode(d);
            } else {
                left.insertInOrder(d);
            }
        } else {
            if (right == null) {
                right = new TreeNode(d);
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public TreeNode find(int d) {
        if (d == data) {
            return this;
        } else if (d <= data) {
            return left != null? left.find(d) : null;
        } else if (d > data) {
            return right != null ? right.find(d) : null;
        }
        return null;
    }
}
