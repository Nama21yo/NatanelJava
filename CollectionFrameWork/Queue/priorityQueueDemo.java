package CollectionFrameWork.Queue;

import java.util.*;

// class MyComp implements Comparator<Integer> { // larger value will have higher priority
//   public int compare(Integer o1, Integer o2) {
//     if(o1 > o2) return  1;
//     if(o1 < o2) return -1;
//     return 0;
//   }
// }

public class priorityQueueDemo {
    public static void main(String[] args) {
        //! Creating a PriorityQueue with natural ordering (Min-Heap)
        // when smaller value have higher priority than larger value
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(3);

        System.out.println("Min-Heap: " + minHeap); // Min-Heap order

        // Accessing the smallest element without removing it
        System.out.println("Peek: " + minHeap.peek()); // Output: 3

        // Removing the smallest element
        System.out.println("Poll: " + minHeap.poll()); // Output: 3

        // Iterating over the PriorityQueue
        System.out.println("After Poll:");
        minHeap.forEach(System.out::println); // Elements in the priority queue order

        // Size of the PriorityQueue
        System.out.println("Size: " + minHeap.size()); // Output: 5

        // Checking if an element exists
        System.out.println("Contains 15? " + minHeap.contains(15)); // Output: true

        // Removing a specific element
        minHeap.remove(15);
        System.out.println("After removing 15:");
        minHeap.forEach(System.out::println); // Elements in the priority queue order

        // Clearing the PriorityQueue
        minHeap.clear();
        System.out.println("After clearing:");
        System.out.println("Is empty? " + minHeap.isEmpty()); // Output: true

        //! Creating a PriorityQueue with custom Comparator (Max-Heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements to the PriorityQueue
        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(3);

        System.out.println("Max-Heap: " + maxHeap); // Max-Heap order

        // Accessing the largest element without removing it
        System.out.println("Peek: " + maxHeap.peek()); // Output: 30

        // Removing the largest element
        System.out.println("Poll: " + maxHeap.poll()); // Output: 30

        // Iterating over the PriorityQueue
        System.out.println("After Poll:");
        maxHeap.forEach(System.out::println); // Elements in the priority queue order
    }
}

