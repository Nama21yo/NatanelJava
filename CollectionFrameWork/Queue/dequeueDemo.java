package CollectionFrameWork.Queue;

import java.util.*;
/*
Methods in ArrayDeque
offerFirst(E e): Inserts the specified element at the front of this deque.
offerLast(E e): Inserts the specified element at the end of this deque.
pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.
pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.

addFirst(E e): Inserts the specified element at the front of this deque.
addLast(E e): Inserts the specified element at the end of this deque.
removeFirst(): Retrieves and removes the first element of this deque.
removeLast(): Retrieves and removes the last element of this deque.
clear(): Removes all elements from the deque.
*/

public class dequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Adding elements to the deque
        dq.offerLast(10);  // Add to the end
        dq.offerLast(20);  // Add to the end
        dq.offerLast(30);  // Add to the end
        dq.offerLast(40);  // Add to the end

        System.out.println("Initial Deque:");
        dq.forEach(System.out::println); // Output: 10, 20, 30, 40

        // Removing elements from the deque
        dq.pollFirst(); // Removes 10 from the front

        System.out.println("After pollFirst:");
        dq.forEach(System.out::println); // Output: 20, 30, 40

        // Adding elements to the front
        dq.offerFirst(5); // Add to the front

        System.out.println("After offerFirst:");
        dq.forEach(System.out::println); // Output: 5, 20, 30, 40

        // Accessing elements without removing
        System.out.println("Peek First: " + dq.peekFirst()); // Output: 5
        System.out.println("Peek Last: " + dq.peekLast());   // Output: 40

        // Removing from the back
        dq.pollLast(); // Removes 40 from the end

        System.out.println("After pollLast:");
        dq.forEach(System.out::println); // Output: 5, 20, 30

        // Adding more elements to the end
        dq.offerLast(50);
        dq.offerLast(60);

        System.out.println("After adding more elements:");
        dq.forEach(System.out::println); // Output: 5, 20, 30, 50, 60

        // Removing from the front
        dq.removeFirst(); // Removes 5

        System.out.println("After removeFirst:");
        dq.forEach(System.out::println); // Output: 20, 30, 50, 60

        // Clear the deque
        dq.clear();

        System.out.println("After clear:");
        System.out.println("Is deque empty? " + dq.isEmpty()); // Output: true
    }
}

