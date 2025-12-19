package com.ranjan.ctci.arraysandstrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OneAway {
    public static void main(String[] args) {
        String choice = "y";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\nFirst String : ");
            String first = scanner.next();

            System.out.print("\nSecond String : ");
            String second = scanner.next();

            System.out.println("isOneAway ? " + oneAway(first, second));

            System.out.println("Do you wish to continue? (y/n)");
            choice = scanner.next();
        } while ("y".equals(choice) || "Y".equals(choice));
        scanner.close();
    }

    private static boolean oneAway(String first, String second) {
        int diff = first.length() - second.length();
        if (!(Math.abs(diff) == 0 || Math.abs(diff) == 1)) {
            return false;
        }
        int diffCount = 0;
        Set<Character> set = new HashSet<>();
        for (char c : first.toCharArray()) {
            set.add(c);
        }
        for (char c : second.toCharArray()) {
            if (!set.contains(c)) {
                diffCount++;
            }
        }
        if (diffCount > 1) {
            return false;
        }
        return true;
    }
}
