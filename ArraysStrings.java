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

}
