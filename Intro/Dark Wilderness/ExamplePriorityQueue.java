import java.util.PriorityQueue;
import java.util.Queue;

public class ExamplePriorityQueue {
    public static void main(String[] args) {
        Queue<String> myPriorityQueue = new PriorityQueue<>();

        // isEmpty(): Checks if the queue is empty
        boolean isEmpty = myPriorityQueue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // offer(E element): Adds an element to the back of the queue
        myPriorityQueue.offer("Apple");
        myPriorityQueue.offer("Banana");
        myPriorityQueue.offer("Orange");

        // size(): Returns the number of elements in the queue
        int size = myPriorityQueue.size();
        System.out.println("Size of the queue: " + size);

        // peek(): Retrieves, but does not remove, the element at the front of the queue
        String peekedElement = myPriorityQueue.peek();
        System.out.println("Element at the front of the queue (peek): " + peekedElement);

        // poll(): Retrieves and removes the element at the front of the queue
        String polledElement = myPriorityQueue.poll();
        System.out.println("Element removed from the front of the queue (poll): " + polledElement);

        // clear(): Removes all elements from the queue
        myPriorityQueue.clear();

        System.out.println("Updated queue: " + myPriorityQueue);
    }
}
