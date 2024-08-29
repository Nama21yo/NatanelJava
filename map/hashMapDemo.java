package map;

import java.util.*;

public class hashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. put(K key, V value): Adds a key-value pair to the HashMap.
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        System.out.println("Initial HashMap: " + map);

        //! 2. get(Object key): Returns the value associated with the specified key.
        String value = map.get(2); // Should return "Banana"
        System.out.println("Value for key 2: " + value);

        //! 3. containsKey(Object key): Checks if a key is present in the map.
        boolean hasKey = map.containsKey(3); // Should return true
        System.out.println("HashMap contains key 3: " + hasKey);

        // 4. containsValue(Object value): Checks if a value is present in the map.
        boolean hasValue = map.containsValue("Apple"); // Should return true
        System.out.println("HashMap contains value 'Apple': " + hasValue);

        // 5. remove(Object key): Removes the key-value pair associated with the specified key.
        map.remove(4); // Removes the entry with key 4 ("Date")
        System.out.println("HashMap after removing key 4: " + map);

        // 6. putIfAbsent(K key, V value): Adds the key-value pair only if the key is not already present.
        map.putIfAbsent(3, "Elderberry"); // Does not change as key 3 already exists
        map.putIfAbsent(5, "Fig"); // Adds a new entry with key 5
        System.out.println("HashMap after putIfAbsent: " + map);

        // 7. replace(K key, V value): Replaces the value associated with the specified key.
        map.replace(1, "Apricot"); // Replaces "Apple" with "Apricot"
        System.out.println("HashMap after replace: " + map);

        // 8. keySet(): Returns a Set view of the keys contained in this map.
        System.out.println("Keys in HashMap: " + map.keySet());
        // Retrieving the keySet
        Set<Integer> keys = map.keySet();

        // Iterating over keys
        System.out.println("Keys in the HashMap:");
        for (Integer key : keys) {
            System.out.println(key);
        }

        // 9. values(): Returns a Collection view of the values contained in this map.
        System.out.println("Values in HashMap: " + map.values());

        // 10. entrySet(): Returns a Set view of the key-value pairs (Map.Entry objects) contained in this map.
        System.out.println("Entries in HashMap: " + map.entrySet());

        // 11. size(): Returns the number of key-value mappings in the map.
        int size = map.size(); // Should return 4
        System.out.println("Size of HashMap: " + size);

        // 12. clear(): Removes all of the mappings from the map.
        map.clear();
        System.out.println("HashMap after clear: " + map);

        // 13. isEmpty(): Checks if the map is empty.
        boolean isEmpty = map.isEmpty(); // Should return true
        System.out.println("Is HashMap empty? " + isEmpty);
    }
}
