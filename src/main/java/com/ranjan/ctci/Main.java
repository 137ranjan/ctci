package com.ranjan.ctci;

import com.ranjan.ctci.treesandgraphs.buildorder.BuildOrder;
import com.ranjan.ctci.treesandgraphs.buildorder.Project;

public class Main {

    public static void main(String[] args) {
        String[] projects = {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"}
        };

        BuildOrder buildOrder = new BuildOrder();
        Project[] order = buildOrder.findBuildOrder(projects, dependencies);
        for (Project project : order) {
            System.out.print(project.getName() + ", ");
        }
    }
}