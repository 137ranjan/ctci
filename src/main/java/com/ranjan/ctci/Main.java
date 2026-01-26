package com.ranjan.ctci;

import com.ranjan.ctci.treesandgraphs.buildorder.Project;
import com.ranjan.ctci.treesandgraphs.buildorder2.BuildOrder2;

import java.util.Stack;

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

        BuildOrder2 buildOrder = new BuildOrder2();
        Stack<Project> order = buildOrder.findBuildOrder(projects, dependencies);
        while (!order.isEmpty()) {
            System.out.print(order.pop().getName() + ", ");
        }
    }
}