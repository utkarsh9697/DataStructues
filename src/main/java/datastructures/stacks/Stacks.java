package datastructures.stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        implementStacks();
    }

    /**
     * This method is used to show stack implementation for push, pop, peek ,search and empty methods implementation
     * of stacks.
     */
    private static void implementStacks() {
        Stack<Integer> stack = new Stack<>();

        // Pushing values in stack. Also using peek to see element at the top of the stack
        for (int i = 0; i < 4; i++) {
            stack.push(i);
            System.out.println("Added value in stack is " + stack.peek());
        }

        // Searches value to be present in stack. Value defaults to -1 for not found
        if (stack.search(1) != -1) {
            System.out.println("Element found in stack");
        }

        // Popping elements until stack is empty
        while (!stack.empty()) {
            System.out.println("Element being popped out from stack is " + stack.peek());
            stack.pop();
        }

        // Displaying stack empty message after popping all elements
        if(stack.empty()){
            System.out.println("Stack is empty now");
        }
    }
}