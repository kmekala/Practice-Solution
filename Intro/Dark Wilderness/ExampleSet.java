import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        // isEmpty(): Checks if the set is empty
        boolean isEmpty = mySet.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // add(E element): Adds an element to the set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        // size(): Returns the number of elements in the set
        int size = mySet.size();
        System.out.println("Size of the set: " + size);

        // contains(Object element): Checks if the set contains a specific element
        boolean containsElement = mySet.contains("Banana");
        System.out.println("Does the set contain 'Banana'? " + containsElement);

        // remove(Object element): Removes a specific element from the set
        boolean removedElement = mySet.remove("Apple");
        System.out.println("Was 'Apple' removed from the set? " + removedElement);

        // Iterating over the set
        System.out.println("Set elements:");
        for (String element : mySet) {
            System.out.println(element);
        }

        // clear(): Removes all elements from the set
        mySet.clear();
        System.out.println("Set after clearing: " + mySet);

        // addAll(Collection<? extends E> collection): Adds all elements from a collection to the set
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Grape");
        anotherSet.add("Mango");
        mySet.addAll(anotherSet);
        System.out.println("Set after adding another set: " + mySet);

        // removeAll(Collection<?> collection): Removes all elements in the set that are also in the given collection
        mySet.removeAll(anotherSet);
        System.out.println("Set after removing another set: " + mySet);

        // retainAll(Collection<?> collection): Retains only the elements in the set that are also in the given collection
        mySet.add("Banana");
        mySet.add("Orange");
        mySet.add("Grape");
        mySet.retainAll(anotherSet);
        System.out.println("Set after retaining another set: " + mySet);

        // equals(Object object): Checks if the set is equal to another object
        boolean isEqual = mySet.equals(anotherSet);
        System.out.println("Is the set equal to another set? " + isEqual);
    }
}
