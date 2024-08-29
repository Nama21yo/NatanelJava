package CollectionFrameWork.Set;

import java.util.*;

public class hashSetDemo {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // 1. add(E e): Adds elements to the HashSet
        fruits.add("Apple");
        /*Adds the specified element to this set if it is not already present. More formally, adds the specified element e to this set if this set contains no element e2 such that Objects.equals(e, e2). If this set already contains the element, the call leaves the set unchanged and returns false. */
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Trying to add a duplicate element
        boolean isAdded = fruits.add("Apple");
        System.out.println("Is 'Apple' added again? " + isAdded); // Output: false

        // 2. remove(Object o): Removes a specific element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // 3. contains(Object o): Checks if the set contains the specified element
        boolean containsOrange = fruits.contains("Orange");
        System.out.println("Does the set contain 'Orange'? " + containsOrange); // Output: true

        // 4. size(): Returns the number of elements in the HashSet
        int size = fruits.size();
        System.out.println("Size of the HashSet: " + size); // Output: 3

        // 5. isEmpty(): Checks if the HashSet is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty); // Output: false

        // 6. clear(): Removes all elements from the HashSet
        fruits.clear();
        System.out.println("After clearing, is the HashSet empty? " + fruits.isEmpty()); // Output: true

        // 7. addAll(Collection<? extends E> c): Adds all elements from another collection
        HashSet<String> moreFruits = new HashSet<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Mango");

        fruits.addAll(moreFruits);
        System.out.println("After adding all elements from moreFruits: " + fruits); // Output: [Pineapple, Mango]

        // 8. containsAll(Collection<?> c): Checks if the set contains all elements from another collection
        boolean containsAll = fruits.containsAll(moreFruits);
        System.out.println("Does the set contain all elements from moreFruits? " + containsAll); // Output: true

        //! 9. retainAll(Collection<?> c): Retains only the elements that are in both sets
        HashSet<String> commonFruits = new HashSet<>();
        commonFruits.add("Mango");
        commonFruits.add("Apple");

        fruits.retainAll(commonFruits);
        System.out.println("After retaining common elements: " + fruits); // Output: [Mango]

        // 10. toArray(): Convert the HashSet to an array
        Object[] fruitsArray = fruits.toArray();
        System.out.print("HashSet elements in an array: ");
        for (Object fruit : fruitsArray) {
            System.out.print(fruit + " "); // Output: Mango 
        }
    }
}
