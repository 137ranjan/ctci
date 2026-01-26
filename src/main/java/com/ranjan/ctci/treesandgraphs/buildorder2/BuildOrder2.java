package com.ranjan.ctci.treesandgraphs.buildorder2;


import com.ranjan.ctci.treesandgraphs.buildorder.Graph;
import com.ranjan.ctci.treesandgraphs.buildorder.Project;

import java.util.List;
import java.util.Stack;

public class BuildOrder2 {

    public Stack<Project> findBuildOrder(String[] projects, String[][] dependencies) {
        Graph graph = buildGraph(projects, dependencies);
        return orderProjects(graph.getNodes());

    }

    private Stack<Project> orderProjects(List<Project> projects) {
        Stack<Project> stack = new Stack<>();
        for (Project project : projects) {
            if (project.getState() == Project.State.BLANK) {
                if (!doDFS(project, stack)) {
                    return null;
                }
            }
        }
        return stack;
    }

    private boolean doDFS(Project project, Stack<Project> stack) {
        if (project.getState() == Project.State.PARTIAL) {
            return false; // Cycle
        }

        if (project.getState() == Project.State.BLANK) {
            project.setState(Project.State.PARTIAL);
            List<Project> children = project.getChildren();
            for (Project child : children) {
                if (!doDFS(child, stack)) {
                    return false;
                }
            }
            project.setState(Project.State.COMPLETE);
            stack.push(project);
        }
        return true;
    }

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

}
