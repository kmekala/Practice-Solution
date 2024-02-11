import java.util.PriorityQueue;

public class ExamplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();

        // offer(E element): Inserts the specified element into the priority queue
        myPriorityQueue.offer(5);
        myPriorityQueue.offer(2);
        myPriorityQueue.offer(7);
        myPriorityQueue.offer(1);

        // size(): Returns the number of elements in the priority queue
        int size = myPriorityQueue.size();
        System.out.println("Size of the priority queue: " + size);

        // peek(): Retrieves, but does not remove, the head of the priority queue
        Integer headElement = myPriorityQueue.peek();
        System.out.println("Head element of the priority queue: " + headElement);

        // poll(): Retrieves and removes the head of the priority queue
        Integer removedElement = myPriorityQueue.poll();
        System.out.println("Removed element from the priority queue: " + removedElement);

        // isEmpty(): Checks if the priority queue is empty
        boolean isEmpty = myPriorityQueue.isEmpty();
        System.out.println("Is the priority queue empty? " + isEmpty);

        // contains(Object element): Checks if the priority queue contains a specific element
        boolean containsElement = myPriorityQueue.contains(7);
        System.out.println("Does the priority queue contain '7'? " + containsElement);

        // clear(): Removes all elements from the priority queue
        myPriorityQueue.clear();
        System.out.println("Priority queue after clearing: " + myPriorityQueue);
    }
}
