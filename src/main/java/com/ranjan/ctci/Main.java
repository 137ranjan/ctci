package com.ranjan.ctci;

import com.ranjan.ctci.treesandgraphs.GraphNode;
import com.ranjan.ctci.treesandgraphs.RouteBetweenNodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GraphNode> graph = new ArrayList<>();
        GraphNode firstNode = new GraphNode();
        GraphNode secondNode = new GraphNode();
        GraphNode thirdNode = new GraphNode();
        GraphNode fourthNode = new GraphNode();
        GraphNode fifthNode = new GraphNode();
        GraphNode sixthNode = new GraphNode();

        fifthNode.adjacent.add(sixthNode);
        thirdNode.adjacent.add(fourthNode);
        secondNode.adjacent.add(thirdNode);
        secondNode.adjacent.add(fourthNode);
        firstNode.adjacent.add(secondNode);

        graph = Arrays.asList(firstNode, secondNode, thirdNode, fourthNode, fifthNode, sixthNode);

        RouteBetweenNodes routeBetweenNodes = new RouteBetweenNodes();
        System.out.println(routeBetweenNodes.search(graph, firstNode, fifthNode));


    }
}
