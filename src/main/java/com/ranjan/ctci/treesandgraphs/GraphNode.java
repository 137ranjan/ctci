package com.ranjan.ctci.treesandgraphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int data;
    public List<GraphNode> adjacent;
    public boolean visited;

    public GraphNode() {
        adjacent = new ArrayList<>();
    }
}
