package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {
    public static class StackNode {
        public int data;
        public StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;
    public int min;


    public int pop() {
        if (top == null) throw new EmptyStackException();
        int item = top.data;
        top = top.next;
        return item;
    }

    public void push(int item) {
        StackNode t = new StackNode(item);
        if (isEmpty())
            min = item;
        else if (item < min)
            min = item;
        t.next = top;
        top = t;
    }

    public int peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    //Question 3.2: Implement a minimum function to find min value on Stack
    //Set up a min value in the node class
    public int min() {
        return min;
    }

    public static Stack<Integer> sort(Stack<Integer> inStack) {
        Stack<Integer> stack = new Stack<>();
        //Two while loops, O(n^2) time complexity, O(n) space complexity
        //Pushes onto the input stack everything until the "stack" var has the sorted integers
        while (!inStack.isEmpty()) {
            int temp = inStack.pop();
            while (!stack.isEmpty() && stack.peek() > temp) {
                inStack.push(stack.pop());
            }
            stack.push(temp);
        }

        return stack;

    }
}
