import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // isEmpty(): Checks if the list is empty
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // add(E element): Adds an element to the end of the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // size(): Returns the number of elements in the list
        int size = myList.size();
        System.out.println("Size of the list: " + size);

        // contains(Object element): Checks if the list contains a specific element
        boolean containsElement = myList.contains("Banana");
        System.out.println("Does the list contain 'Banana'? " + containsElement);

        // remove(Object element): Removes the first occurrence of a specific element from the list
        boolean removedElement = myList.remove("Apple");
        System.out.println("Was 'Apple' removed from the list? " + removedElement);

        // get(int index): Retrieves the element at the specified index
        String elementAtIndex = myList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        // set(int index, E element): Replaces the element at the specified index with a new element
        myList.set(0, "Grape");
        System.out.println("Updated list: " + myList);

        // indexOf(Object element): Returns the index of the first occurrence of a specific element in the list
        int index = myList.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);

        // subList(int fromIndex, int toIndex): Returns a view of the portion of the list between the specified indexes
        List<String> subList = myList.subList(1, 3);
        System.out.println("Sublist: " + subList);

        // clear(): Removes all elements from the list
        myList.clear();
        System.out.println("List after clearing: " + myList);
    }
}
