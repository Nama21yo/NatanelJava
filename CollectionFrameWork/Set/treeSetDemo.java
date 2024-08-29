package CollectionFrameWork.Set;

import java.util.*;

public class treeSetDemo {
    public static void main(String[] args) {
        // Creating a TreeSet of Integer type
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(50);

        // Displaying the elements in TreeSet
        // TreeSet maintains elements in sorted order
        System.out.println("TreeSet elements in ascending order:");
        System.out.println(treeSet);

        // Attempting to add duplicate elements
        treeSet.add(20); // Will not be added
        System.out.println("After trying to add duplicate element '20':");
        System.out.println(treeSet);

        // Removing an element from the TreeSet
        treeSet.remove(30);
        System.out.println("After removing element '30':");
        System.out.println(treeSet);

        // Using some TreeSet methods
        System.out.println("First Element: " + treeSet.first()); // Returns the first element
        System.out.println("Last Element: " + treeSet.last()); // Returns the last element

        // Using higher(), lower(), ceiling(), and floor() methods
        System.out.println("Element higher than 20: " + treeSet.higher(20)); // Returns the least element > 20
        System.out.println("Element lower than 20: " + treeSet.lower(20)); // Returns the greatest element < 20
        System.out.println("Element equal to or higher than 25: " + treeSet.ceiling(25)); // Returns the least element >= 25
        System.out.println("Element equal to or lower than 25: " + treeSet.floor(25)); // Returns the greatest element <= 25

        // Iterating over TreeSet using a for-each loop
        System.out.println("Iterating over TreeSet:");
        for (Integer element : treeSet) {
            System.out.println(element);
        }

        // Using descendingSet() to get elements in reverse order
        System.out.println("TreeSet elements in descending order:");
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println(descendingSet);
    }
}
