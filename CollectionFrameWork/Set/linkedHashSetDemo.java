package CollectionFrameWork.Set;

import java.util.*;

public class linkedHashSetDemo {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");
        linkedHashSet.add("Banana"); // Duplicate element, will not be added

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet content:");
        linkedHashSet.forEach(System.out::println);

        // Checking if an element exists
        boolean hasCherry = linkedHashSet.contains("Cherry");
        System.out.println("\nLinkedHashSet contains 'Cherry': " + hasCherry);

        // Removing an element
        linkedHashSet.remove("Date");
        System.out.println("\nLinkedHashSet after removing 'Date':");
        linkedHashSet.forEach(System.out::println);

        // Checking the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("\nSize of LinkedHashSet: " + size);

        // Iterating over the LinkedHashSet
        System.out.println("\nIterating over LinkedHashSet:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("\nLinkedHashSet after clearing: " + linkedHashSet);
    }
}
