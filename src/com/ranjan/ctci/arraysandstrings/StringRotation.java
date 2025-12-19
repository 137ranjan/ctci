package com.ranjan.ctci.arraysandstrings;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "aterbottlewr";
        System.out.println(isRotation(s1, s2));
    }

    // Check if s2 is a rotation of s1 using only one call to isSubstring()
    // waterbottle -> aterbottlew
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty()) {
            return false;
        }

        return isSubstring(s1, s2 + s2);
    }

    public static boolean isSubstring(String s1, String s2) {
        boolean flag = false;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == s1.charAt(0)) {
                flag = true;
                for (int j = 0; j < s1.length(); j++, i++) {
                    if (s2.charAt(i) != s1.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                return true;
            }
        }
        return false;
    }
}
