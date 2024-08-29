package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(3, "Banana");
        linkedHashMap.put(2, "Cherry");
        linkedHashMap.put(4, "Date");

        //! Displaying the LinkedHashMap
        System.out.println("LinkedHashMap content:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Accessing an element (note: access order is not used in this example)
        String value = linkedHashMap.get(2); // Accessing key 2 (Cherry)
        System.out.println("\nAccessed key 2, value: " + value);

        // Checking if a key or value exists
        boolean hasKey = linkedHashMap.containsKey(3);
        boolean hasValue = linkedHashMap.containsValue("Date");
        System.out.println("\nLinkedHashMap contains key 3: " + hasKey);
        System.out.println("LinkedHashMap contains value 'Date': " + hasValue);

        // Removing an element
        linkedHashMap.remove(1); // Removes the entry with key 1
        System.out.println("\nLinkedHashMap after removing key 1:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Replacing an element
        linkedHashMap.put(4, "Dragonfruit"); // Replaces the value at key 4
        System.out.println("\nLinkedHashMap after replacing value at key 4:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating over keys
        System.out.println("\nKeys in LinkedHashMap:");
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        System.out.println("\nValues in LinkedHashMap:");
        for (String val : linkedHashMap.values()) {
            System.out.println(val);
        }

        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("\nLinkedHashMap after clearing:");
        System.out.println(linkedHashMap); // Should print an empty map
    }
}
