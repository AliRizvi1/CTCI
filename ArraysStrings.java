package com.company;

public class ArraysStrings {

    //Question 1.1: String with all unique characters
    boolean unique(String input) {
        if (input.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i=0;i < input.length();i++) {
            int val = input.charAt(i);
            if (char_set[val])
                return false;
            char_set[val] = true;

        }
        return true;
    }

    //Question 1.2: two strings, write a method to decide if one is a permutation of the other
    String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        sort(str1);
        sort(str2);
        return (sort(str1).equals(sort(str2)));


    }

}
