import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Apple");

        // size(): Returns the number of elements in the list
        int size = myList.size();
        System.out.println("Size of the list: " + size);

        // isEmpty(): Checks if the list is empty
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // contains(Object element): Checks if the list contains a specific element
        boolean containsElement = myList.contains("Banana");
        System.out.println("Does the list contain 'Banana'? " + containsElement);

        // indexOf(Object element): Returns the index of the first occurrence of the specified element in the list
        int firstIndex = myList.indexOf("Apple");
        System.out.println("Index of the first occurrence of 'Apple': " + firstIndex);

        // lastIndexOf(Object element): Returns the index of the last occurrence of the specified element in the list
        int lastIndex = myList.lastIndexOf("Apple");
        System.out.println("Index of the last occurrence of 'Apple': " + lastIndex);

        // subList(int fromIndex, int toIndex): Returns a new list containing elements from the specified range
        List<String> subList = myList.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);
    }
}
