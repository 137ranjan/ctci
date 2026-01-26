package com.ranjan.ctci.treesandgraphs.BuildOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {
    private List<Project> children = new ArrayList<>();
    private Map<String, Project> map = new HashMap<>();
    private String name;
    private int dependencies = 0;

    public Project(String name) {
        this.name = name;
    }

    public void addNeighbor(Project node) {
        if (!map.containsKey(node.getName())) {
            children.add(node);
            map.put(node.getName(), node);
            node.incrementDependencies();
        }
    }

    public void incrementDependencies() {
        dependencies++;
    }

    public void decrementDependencies() {
        dependencies--;
    }

    public String getName() {
        return name;
    }

    public List<Project> getChildren() {
        return children;
    }

    public int getNumberOfDependencies() {
        return dependencies;
    }
}
