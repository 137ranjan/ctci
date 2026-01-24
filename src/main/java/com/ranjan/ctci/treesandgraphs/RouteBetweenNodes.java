package com.ranjan.ctci.treesandgraphs;

import java.util.LinkedList;
import java.util.List;

public class RouteBetweenNodes {
    public boolean search(List<GraphNode> graph, GraphNode start, GraphNode end) {
        if (start == end) return true;

        // operates as Queue
        LinkedList<GraphNode> q = new LinkedList<>();

        for (GraphNode u : graph) {
            u.visited = false;
        }
        q.add(start);
        GraphNode u;
        while (!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                for (GraphNode v : u.adjacent) {
                    if (!v.visited) {
                        if (v == end) {
                            return true;
                        } else {
                            q.add(v);
                        }
                    }
                }
                u.visited = true;
            }
        }
        return false;
    }
}
