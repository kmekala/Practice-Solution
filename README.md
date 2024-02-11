Examples and features for each type of collection in Java:

1. **List**:
   - Ordered collection that allows duplicate elements.
   - Examples: `ArrayList`, `LinkedList`.
   - additional methods:
       * size(): Returns the number of elements in the list.
       * isEmpty(): Checks if the list is empty.
       * contains(Object element): Checks if the list contains a specific element.
       * indexOf(Object element): Returns the index of the first occurrence of the specified element in the list.
       * lastIndexOf(Object element): Returns the index of the last occurrence of the specified element in the list.
       * subList(int fromIndex, int toIndex): Returns a new list containing elements from the specified range.
   - Features:
     - Access elements by index.
     - Add elements at a specific position.
     - Remove elements by index or value.
     - Iterate over elements using iterators or enhanced for loop.

   ```java
   List<String> names = new ArrayList<>();
   names.add("Alice");
   names.add("Bob");
   names.add("Charlie");

   System.out.println(names.get(0)); // Output: "Alice"

   names.add(1, "Dave");
   System.out.println(names); // Output: ["Alice", "Dave", "Bob", "Charlie"]

   names.remove(2);
   System.out.println(names); // Output: ["Alice", "Dave", "Charlie"]

   for (String name : names) {
       System.out.println(name);
   }
   ```

2. **Set**:
   - Collection that does not allow duplicate elements.
   - Examples: `HashSet`, `TreeSet`.
   - Features:
     - Add elements to the set.
     - Remove elements from the set.
     - Check if an element exists in the set.
   - additional methods:
       * size(): Returns the number of elements in the set.
       * isEmpty(): Checks if the set is empty.
       * contains(Object element): Checks if the set contains a specific element.
       * remove(Object element): Removes the specified element from the set.
       * clear(): Removes all elements from the set.
       * addAll(Collection<? extends E> collection): Adds all elements from a collection to the set.

   ```java
   Set<Integer> numbers = new HashSet<>();
   numbers.add(1);
   numbers.add(2);
   numbers.add(3);

   System.out.println(numbers.contains(2)); // Output: true

   numbers.remove(3);
   System.out.println(numbers); // Output: [1, 2]
   ```

3. **Queue**:
   - Collection that represents a queue (FIFO - First-In-First-Out) data structure.
   - Examples: `LinkedList`, `PriorityQueue`.
   - Features:
     - Add elements to the queue.
     - Remove elements from the front of the queue.
     - Peek at the element at the front of the queue.
   - additional methods:
       * size(): Returns the number of elements in the queue.
       * isEmpty(): Checks if the queue is empty.
       * peek(): Retrieves, but does not remove, the element at the front of the queue.
       * poll(): Retrieves and removes the element at the front of the queue.
       * offer(E element): Adds an element to the back of the queue.
       * clear(): Removes all elements from the queue.

   ```java
   Queue<String> queue = new LinkedList<>();
   queue.offer("First");
   queue.offer("Second");
   queue.offer("Third");

   System.out.println(queue.peek()); // Output: "First"

   String element = queue.poll();
   System.out.println(element); // Output: "First"
   System.out.println(queue); // Output: ["Second", "Third"]
   ```

4. **Map**:
   - Collection that stores key-value pairs, where each key is unique.
   - Examples: `HashMap`, `TreeMap`.
   - Features:
     - Add key-value pairs to the map.
     - Retrieve values by key.
     - Check if a key exists in the map.
     - Iterate over keys or key-value pairs.
   - additional methods:
       * size(): Returns the number of key-value pairs in the map.
       * isEmpty(): Checks if the map is empty.
       * containsKey(Object key): Checks if the map contains a specific key.
       * containsValue(Object value): Checks if the map contains a specific value.
       * get(Object key): Returns the value associated with a specified key.
       * put(K key, V value): Associates the specified value with the specified key in the map.
       * remove(Object key): Removes the key-value pair associated with the specified key from the map.

   ```java
   Map<String, Integer> ages = new HashMap<>();
   ages.put("Alice", 25);
   ages.put("Bob", 30);
   ages.put("Charlie", 35);

   System.out.println(ages.get("Bob")); // Output: 30

   ages.remove("Alice");
   System.out.println(ages); // Output: {"Bob"=30, "Charlie"=35}

   for (String key : ages.keySet()) {
       System.out.println(key + ": " + ages.get(key));
   }
   ```

5. **Stack**:
   - Collection that represents a stack (LIFO - Last-In-First-Out) data structure.
   - Example: `Stack`.
   - Features:
     - Push elements onto the stack.
     - Pop elements from the top of the stack.
     - Peek at the element at the top of the stack.
   - additional methods
       * size(): Returns the number of elements in the stack.
       * isEmpty(): Checks if the stack is empty.
       * peek(): Retrieves, but does not remove, the element at the top of the stack.
       * pop(): Retrieves and removes the element at the top of the stack.
       * push(E element): Adds an element to the top of the stack.
       * search(Object element): Returns the 1-based position of the element from the top of the stack.

   ```java
   Stack<String> stack = new Stack<>();
   stack.push("First");
   stack.push("Second");
   stack.push("Third");

   System.out.println(stack.peek()); // Output: "Third"

   String element = stack.pop();
   System.out.println(element); // Output: "Third"
   System.out.println(stack); // Output: ["First", "Second"]
   ```

These examples demonstrate some common operations and features of each collection type. However, the Java Collections Framework provides many more methods and functionalities for each collection type.
