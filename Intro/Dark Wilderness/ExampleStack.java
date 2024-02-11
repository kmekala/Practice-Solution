import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        // isEmpty(): Checks if the stack is empty
        boolean isEmpty = myStack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // push(E element): Adds an element to the top of the stack
        myStack.push("Apple");
        myStack.push("Banana");
        myStack.push("Orange");

        // size(): Returns the number of elements in the stack
        int size = myStack.size();
        System.out.println("Size of the stack: " + size);

        // peek(): Retrieves, but does not remove, the element at the top of the stack
        String peekedElement = myStack.peek();
        System.out.println("Element at the top of the stack (peek): " + peekedElement);

        // pop(): Retrieves and removes the element at the top of the stack
        String poppedElement = myStack.pop();
        System.out.println("Element removed from the top of the stack (pop): " + poppedElement);

        // search(Object element): Returns the 1-based position of the element from the top of the stack
        int position = myStack.search("Apple");
        System.out.println("'Apple' is at position: " + position);

        System.out.println("Updated stack: " + myStack);
    }
}
