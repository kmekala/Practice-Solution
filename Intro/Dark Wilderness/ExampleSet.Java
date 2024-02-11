import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class ExampleSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        // isEmpty(): Checks if the set is empty
        boolean isEmpty = mySet.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // addAll(Collection<? extends E> collection): Adds all elements from a collection to the set
        Collection<String> collection = new HashSet<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Orange");
        mySet.addAll(collection);

        // size(): Returns the number of elements in the set
        int size = mySet.size();
        System.out.println("Size of the set: " + size);

        // contains(Object element): Checks if the set contains a specific element
        boolean containsElement = mySet.contains("Banana");
        System.out.println("Does the set contain 'Banana'? " + containsElement);

        // remove(Object element): Removes the specified element from the set
        mySet.remove("Apple");

        // clear(): Removes all elements from the set
        mySet.clear();

        System.out.println("Updated set: " + mySet);
    }
}
