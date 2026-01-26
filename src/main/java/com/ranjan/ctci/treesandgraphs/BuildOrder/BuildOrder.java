package com.ranjan.ctci.treesandgraphs.BuildOrder;

import java.util.List;

public class BuildOrder {

    // Find a correct build order
    public Project[] findBuildOrder(String[] projects, String[][] dependencies) {
        Graph graph = buildGraph(projects, dependencies);
        return orderProjects(graph.getNodes());
    }

    /* Build the graph, adding the edge (a, b) if b is dependent on a. Assumes a pair
     *  is listed in "build order". The pair (a, b) in dependencies indicates that b
     *  depends on a and must be built before b.
     * */
    private Graph buildGraph(String[] projects, String[][] dependencies) {
        Graph graph = new Graph();
        for (String project : projects) {
            graph.getOrCreateNode(project);
        }

        for (String[] dependency : dependencies) {
            String first = dependency[0];
            String second = dependency[1];
            graph.addEdge(first, second);
        }

        return graph;
    }

    // Return a list of the projects in a correct build order
    private Project[] orderProjects(List<Project> projects) {
        Project[] order = new Project[projects.size()];

        // Add "roots" to the build order first.
        int endOfList = addNonDependent(order, projects, 0);

        int toBeProcessed = 0;
        while (toBeProcessed < order.length) {
            Project current = order[toBeProcessed];

            // We have a circular dependency since there are no remaining projects with zero dependencies
            if (current == null) {
                return null;
            }

            // Remove myself as a dependency
            List<Project> children = current.getChildren();
            for (Project child : children) {
                child.decrementDependencies();
            }

            // Add children that have no one depending on them
            endOfList = addNonDependent(order, children, endOfList);
            toBeProcessed++;
        }

        return order;
    }

    private int addNonDependent(Project[] order, List<Project> projects, int offset) {
        for (Project project : projects) {
            if (project.getNumberOfDependencies() == 0) {
                order[offset] = project;
                offset++;
            }
        }
        return offset;
    }
}
