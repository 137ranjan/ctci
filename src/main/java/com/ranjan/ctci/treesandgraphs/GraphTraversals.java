package com.ranjan.ctci.treesandgraphs;

import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversals {
    public void dfs(GraphNode root) {
        if (root == null) return;
        visit(root);
        root.visited = true;
        for (GraphNode node : root.adjacent) {
            if (!node.visited) {
                dfs(node);
            }
        }
    }

    public void bfs(GraphNode root) {
        Queue<GraphNode> queue = new LinkedList<>();
        root.visited = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            GraphNode currNode = queue.remove();
            visit(currNode);
            for (GraphNode adjacentNode : currNode.adjacent) {
                if (!adjacentNode.visited) {
                    adjacentNode.visited = true;
                    queue.add(adjacentNode);
                }
            }
        }
    }

    public void visit(GraphNode node) {
        System.out.print(node.data + " ");
    }
}
