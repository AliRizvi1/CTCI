package com.company;


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
        String compression = arrTest.compression("abcd");
        System.out.println(compression);
    }
}
