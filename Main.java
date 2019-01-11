package com.company;
import sun.awt.image.ImageWatched;

import java.util.*;


public class Main {

    public static void main(String[] args) {


        ArraysStrings arrTest = new ArraysStrings();

        //1.1:
//        if(arrTest.unique("abcdfeinvkti"))
//            System.out.println("Unique!");
//        else
//            System.out.println("Not unique!");

        //1.2:
//        if (arrTest.permutation("god","dog"))
//            System.out.println("Permutation!");
//        else
//            System.out.println("Not permutation!");


        //1.5: One away
//        if (arrTest.oneEdit("f","d"))
//            System.out.println("yes");
//        else
//            System.out.println("no");

//        System.out.println(arrTest.reverse("33333939292920-1"));

        //1.6: compressed
        String compression = arrTest.compression("aabbccddddd");
        System.out.println(compression);

        //Testing queues and stacks
        //Have to remember queue is new LinkedList, while stack is new Stack<>()
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        System.out.println(queue.remove());
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        System.out.println(stack.pop());



    }
}
