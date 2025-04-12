package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Create
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Read
        System.out.println("Initial Stack: " + stack);
        System.out.println("Top: " + stack.peek());

        // Update
        stack.pop();
        stack.push("C#");
        stack.set(0, "Go");

        // Delete
        stack.pop();

        System.out.println("Final Stack: " + stack);
    }
}
