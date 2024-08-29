import java.util.Arrays;

public class arraysMethodDemo {
    public static void main(String[] args) {
        // Initializing an array
        int[] numbers = {5, 2, 8, 7, 1};

        // 1. Arrays.toString() - Converts array to a string representation
        System.out.println("1. Arrays.toString() Output:");
        System.out.println(Arrays.toString(numbers)); // Output: [5, 2, 8, 7, 1]

        // 2. Arrays.sort() - Sorts the array in ascending order
        Arrays.sort(numbers);
        System.out.println("\n2. Arrays.sort() Output:");
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 7, 8]

        // 3. Arrays.binarySearch() - Searches for a value in the array and returns its index
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("\n3. Arrays.binarySearch() Output:");
        System.out.println("Index of 7: " + index); // Output: Index of 7: 3

        // 4. Arrays.fill() - Fills all elements of the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 3);
        System.out.println("\n4. Arrays.fill() Output:");
        System.out.println(Arrays.toString(filledArray)); // Output: [3, 3, 3, 3, 3]

        // 5. Arrays.copyOf() - Copies the specified array, truncating or padding with zeros if necessary
        int[] copiedArray = Arrays.copyOf(numbers, 7); // Copies first 5 elements, adds 2 zeros
        System.out.println("\n5. Arrays.copyOf() Output:");
        System.out.println(Arrays.toString(copiedArray)); // Output: [1, 2, 5, 7, 8, 0, 0]

        // 6. Arrays.equals() - Checks if two arrays are equal
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("\n6. Arrays.equals() Output:");
        System.out.println("Are array1 and array2 equal? " + areEqual); // Output: true

        // 7. Arrays.mismatch() - Returns the index of the first mismatch between two arrays
        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 4, 3};
        int mismatchIndex = Arrays.mismatch(array3, array4);
        System.out.println("\n7. Arrays.mismatch() Output:");
        System.out.println("Mismatch index between array3 and array4: " + mismatchIndex); // Output: 1

        // 8. Arrays.parallelSort() - Sorts the array using parallel sort (suitable for large arrays)
        int[] largeArray = {9, 7, 5, 3, 1, 8, 6, 4, 2, 0};
        Arrays.parallelSort(largeArray);
        System.out.println("\n8. Arrays.parallelSort() Output:");
        System.out.println(Arrays.toString(largeArray)); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 9. Arrays.stream() - Returns a sequential stream with the specified array as its source
        /*
        Streams provide a powerful, functional approach to processing data in Java. Using Arrays.stream(), you can easily perform operations like filtering, mapping, and reducing on arrays, making your code more concise and expressive. 
        */
        System.out.println("\n9. Arrays.stream() Output:");
        long count = Arrays.stream(largeArray).filter(n -> n % 2 == 0).count();
        System.out.println("Number of even numbers in largeArray: " + count); // Output: 5
    }
}

