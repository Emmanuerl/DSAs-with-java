package ds;

import java.util.Stack;

/*
 * 1. The stack datatype extends the Vector Class (it's also part of the collection framework)
 * 2. It should be noted that stacks use threads under the hood (since they extend the vector class and hence should not be overused)
 */
public class CustomStack {
    public static void main(String[] args) {
        // Note: the type T of a stack cannot be a primitive type
        var stack = new Stack<Integer>();

        // pushing to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // to retrieve the size of the stack (number of items)
        System.out.println(stack.size());
        // retrieves the latest item without removing it
        System.out.println(stack.peek());
        // pops an item off the stack and returns the popped item
        System.out.println(stack.pop());
        // checks if the stack is empty
        System.out.println(stack.empty());
    }
}
