package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.*;

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

    //Question 1.5: One edit away
    boolean oneReplace(String str1, String str2) {
        //Lengths are always equal when you replace
        boolean differentLetter = false;
        //could've used the string toChar(int index) function. See below
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        for (int i = 0; i < str1.length();i++) {
            if (char1[i] != char2[i]) {
                if (differentLetter)
                    return false;
                else
                    differentLetter = true;
            }
        }
        return true;

    }
    //Have to make sure to check for length in the final method

    //Insertion: str1.length() < str2.length()
    //Removal: str1.length() > str2.length(). Just switch the inputs around? should be same process
    boolean oneInsert(String str1, String str2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < str2.length() && index1 < str1.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                //Increase index2 to skip over the extra letter.
                index2++;

            }
            else {
                index2++;
                index1++;
            }
        }
        return true;
    }

    //Assume returning false if outside of scope
    //Edge case: empty strings
    boolean oneEdit(String str1, String str2) {
        if (str1.length() == 0 && str2.length() == 0)
            return false;
        if (str1.length() == str2.length())
            return oneReplace(str1,str2);
        else if (str1.length() == (str2.length() - 1))
            return oneInsert(str1,str2);
        else if (str2.length() == (str1.length() - 1))
            return oneInsert(str2, str1);
        else
            return false;
    }

    //New Question: Reverse string
    String reverse(String str) {
        Character[] arr = new Character[str.length()];
        //Going to want to use a Stack, because stack is LIFO
        Stack<Character> stack = new Stack();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.pop();
        }
        String retStr = arr.toString();
        return retStr;
    }

    //1.6: String compression
    String compression(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        char[] strArr = str.toCharArray();
        for (int i = 0;i <= str.length() - 1; i++) {
            if ((i == str.length() - 1)) {
                count++;
                compressed.append("" + strArr[i] + count);

            }
            else if (strArr[i] != strArr[i+1]) {
                count++;
                compressed.append("" + strArr[i] + count);
                count = 0;
            }
            else if (strArr[i] == strArr[i+1]) {
                count ++;
            }
        }
        if (compressed.length() > str.length())
            return str;
        return compressed.toString();
    }

    static int binarySearch(int[] a, int x) {
        /*a binary search to find a specific number in an array. Much faster than what I've been using
        bubble sort, which has O(n^2) because of the embedded for loop
        binary search runtime: O(logn)
         */
        int low = 0;
        int high = a.length - 1;
        int mid;
        //{4,3,9,1,8,6), looking for 8. 8 is at index 5

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] < x) {
                low = mid + 1;
            }
            else if (a[mid] > x) {
                high = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }

    static int charBinarySearch(char[] c, char x) {
        int low = (int) 'a';
        int high = (int) 'z';
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (c[mid] < x) {
                low = mid + 1;
            }
            else if (c[mid] > x)
                high = mid - 1;
            else
                return mid;
        }
        return -1;

    }

    static int makeAnagram(String a, String b) {
        Map<Character, Integer> count = new HashMap<>();
        //For every char in the first string, add +1 to the value at the key
        //For every char in the second string, take -1 to the value of the key
        //The letters that are the same will have a value of 0, all the other values will be the amount
        //needed to delete
        for (char c : a.toCharArray()) {
            int ct = count.containsKey(c) ? count.get(c) : 0;
            count.put(c,ct+1);
        }
        for (char c : b.toCharArray()) {
            int ct = count.containsKey(c) ? count.get(c) : 0;
            count.put(c,ct-1);

        }
        List<Integer> values = new ArrayList<>(count.values());
        int total = 0;
        for (int i : values) {
            total += Math.abs(i);
        }
        return total;

    }


    //Use merge sort for a sorting algorithm:



    //x^2 + y^2 + z^2 = 2019 where x,y, and z are prime numbers.
    int[] twentyNineteen() {
        return null;
    }


}
