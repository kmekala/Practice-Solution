import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // put(K key, V value): Associates the specified value with the specified key in the map
        myHashMap.put("Apple", 1);
        myHashMap.put("Banana", 2);
        myHashMap.put("Orange", 3);

        // size(): Returns the number of key-value mappings in the map
        int size = myHashMap.size();
        System.out.println("Size of the map: " + size);

        // get(Object key): Returns the value to which the specified key is mapped, or null if the key is not present
        Integer value = myHashMap.get("Apple");
        System.out.println("Value for key 'Apple': " + value);

        // containsKey(Object key): Checks if the map contains the specified key
        boolean containsKey = myHashMap.containsKey("Banana");
        System.out.println("Does the map contain key 'Banana'? " + containsKey);

        // containsValue(Object value): Checks if the map contains the specified value
        boolean containsValue = myHashMap.containsValue(3);
        System.out.println("Does the map contain value 3? " + containsValue);

        // remove(Object key): Removes the mapping for the specified key from the map
        Integer removedValue = myHashMap.remove("Orange");
        System.out.println("Removed value for key 'Orange': " + removedValue);

        // keySet(): Returns a set of all the keys in the map
        System.out.println("Keys in the map: " + myHashMap.keySet());

        // values(): Returns a collection of all the values in the map
        System.out.println("Values in the map: " + myHashMap.values());

        // entrySet(): Returns a set of all the key-value mappings in the map
        System.out.println("Key-Value mappings in the map: " + myHashMap.entrySet());

        // clear(): Removes all key-value mappings from the map
        myHashMap.clear();
        System.out.println("Map after clearing: " + myHashMap);
    }
}
