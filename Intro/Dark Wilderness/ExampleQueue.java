import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        // isEmpty(): Checks if the queue is empty
        boolean isEmpty = myQueue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // offer(E element): Adds an element to the back of the queue
        myQueue.offer("Apple");
        myQueue.offer("Banana");
        myQueue.offer("Orange");

        // size(): Returns the number of elements in the queue
        int size = myQueue.size();
        System.out.println("Size of the queue: " + size);

        // peek(): Retrieves, but does not remove, the element at the front of the queue
        String peekedElement = myQueue.peek();
        System.out.println("Element at the front of the queue (peek): " + peekedElement);

        // poll(): Retrieves and removes the element at the front of the queue
        String polledElement = myQueue.poll();
        System.out.println("Element removed from the front of the queue (poll): " + polledElement);

        // clear(): Removes all elements from the queue
        myQueue.clear();

        System.out.println("Updated queue: " + myQueue);
    }
}
