import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        // offer(E element): Adds an element to the queue
        myQueue.offer("Apple");
        myQueue.offer("Banana");
        myQueue.offer("Orange");

        // size(): Returns the number of elements in the queue
        int size = myQueue.size();
        System.out.println("Size of the queue: " + size);

        // peek(): Retrieves the element at the front of the queue without removing it
        String frontElement = myQueue.peek();
        System.out.println("Front element of the queue: " + frontElement);

        // poll(): Retrieves and removes the element at the front of the queue
        String removedElement = myQueue.poll();
        System.out.println("Removed element from the queue: " + removedElement);

        // isEmpty(): Checks if the queue is empty
        boolean isEmpty = myQueue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // contains(Object element): Checks if the queue contains a specific element
        boolean containsElement = myQueue.contains("Banana");
        System.out.println("Does the queue contain 'Banana'? " + containsElement);

        // clear(): Removes all elements from the queue
        myQueue.clear();
        System.out.println("Queue after clearing: " + myQueue);
    }
}
