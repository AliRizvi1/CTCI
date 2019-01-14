package com.company;
import sun.awt.image.ImageWatched;

import java.util.*;

import static com.company.ArraysStrings.charBinarySearch;
import static com.company.MathLogic.minimumSwaps;
import static com.company.MathLogic.numberOfTokens;
import static com.company.MyStack.sort;




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
//        String compression = arrTest.compression("aabbccddddd");
//        System.out.println(compression);

        //Testing queues and stacks
        //Have to remember queue is new LinkedList, while stack is new Stack<>()
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(4);
//        System.out.println(queue.remove());
//        Stack<Integer> stack = new Stack<>();
//        stack.push(4);
//        System.out.println(stack.pop());

        //Question 3.2: Stacks and Queues
//        MyStack stack = new MyStack();
//        stack.push(90);
//        stack.push(12);
//        stack.push(24);
//        stack.push(88);
//        System.out.println(stack.min());

        //Question 3.5: sort algorithm for a stack, using a max of two stacks
//        Stack<Integer> stack = new Stack<>();
//        stack.push(4);
//        stack.push(21);
//        stack.push(1);
//        stack.push(8);
//        stack.push(2);
//        stack = sort(stack);
//        System.out.println(stack.pop());
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(4);
//        arr.add(2);
//        for (int i = 0; i < arr.size(); i++)
//            System.out.println(arr.get(i));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(n);
//        List<List<Integer>> commands = new ArrayList<>();
//
//        int x = numberOfTokens(4, commands);
//        System.out.println(x);

//        int[] arr = {4,3,1,2};
//        minimumSwaps(arr);
        Hashtable<Integer, String> employees = new Hashtable<>();
        //Stores a hashvalue to represent 1
        employees.put(1, "Bob");
        employees.put(5, "Sam");

        for (String item : employees.values()) {
            System.out.println(item);
        }
        char[] c = {'b'};
        char x = 'x';
        System.out.println('a' < 'z');




    }
}
