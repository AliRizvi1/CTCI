package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class MathLogic {
    boolean prime(int n) {
        if (n < 2)
            return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }



    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        expiryLimit = sc.nextInt();
        //n is the number of elements in the commands
        int n = sc.nextInt();
        int third = sc.nextInt();
        // Each row of the 2d array has 3 integers: [command, token_id, T]
        // Get is represented by 0 and reset by 1

        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            //Create a new temporary list to add into commands after 3 integers have been inputted
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            commands.add(temp);
        }
        //Implement using a HashTable
        Hashtable<Integer, Integer> tokens = new Hashtable<>();
        //The key's will be the tokens and the values will represent the expiry limit.
        for (int i = 0; i < n; i++) {
            if (commands.get(i).get(0) == 0) {
                tokens.put(commands.get(i).get(1),commands.get(i).get(2) + expiryLimit);
            }
            //else the command is to reset
            else {
                //Case where token can be reset
                if (tokens.get(commands.get(i).get(1)) >= commands.get(i).get(1)) {
                    tokens.put(commands.get(i).get(1), commands.get(i).get(2) + expiryLimit);
                }
                //Realize this implementation only works with one token each.
                else if (tokens.get(commands.get(i).get(1)) < commands.get(i).get(1)) {
                    tokens.remove(commands.get(i).get(1));
                }
            }
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (!tokens.isEmpty()) {
                if (tokens.contains(commands.get(i).get(1)))
                    //if tokens contains the key (aka the token itself), increase x, meaning a token is stored
                    x++;
            }
            else
                return 0;
        }
        return x;


    }
}
