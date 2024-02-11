import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        // isEmpty(): Checks if the map is empty
        boolean isEmpty = myMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // put(K key, V value): Associates the specified value with the specified key in the map
        myMap.put("Apple", 1);
        myMap.put("Banana", 2);
        myMap.put("Orange", 3);

        // size(): Returns the number of key-value pairs in the map
        int size = myMap.size();
        System.out.println("Size of the map: " + size);

        // containsKey(Object key): Checks if the map contains a specific key
        boolean containsKey = myMap.containsKey("Banana");
        System.out.println("Does the map contain the key 'Banana'? " + containsKey);

        // containsValue(Object value): Checks if the map contains a specific value
        boolean containsValue = myMap.containsValue(3);
        System.out.println("Does the map contain the value 3? " + containsValue);

        // get(Object key): Returns the value associated with a specified key
        Integer value = myMap.get("Apple");
        System.out.println("Value associated with the key 'Apple': " + value);

        // remove(Object key): Removes the key-value pair associated with the specified key from the map
        myMap.remove("Banana");

        System.out.println("Updated map: " + myMap);
    }
}
