package collections;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Create
        queue.add("Java");
        queue.add("Python");
        queue.offer("C++");

        // Read
        System.out.println("Initial Queue: " + queue);
        System.out.println("Peek: " + queue.peek());

        // Update
        queue.poll();          // Remove Java
        queue.add("Java 17");  // Add new version

        // Delete
        queue.remove();        // Remove Python

        System.out.println("Final Queue: " + queue);
    }
}
