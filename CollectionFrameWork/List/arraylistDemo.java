package CollectionFrameWork.List;

import java.util.*;

public class arraylistDemo{
  public static  void main(String[] args) {
    ArrayList<Integer> al1 = new ArrayList<>(20);

    ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

    //Adding Elements
    al1.add(10);
    al1.add(0,5);
    al1.addAll(al2);
    
    al1.contains(50);//true
    al1.equals(al2); //false

    al1.get(0);//5

    al1.indexOf(5);//0 index
    al1.add(5);
    al1.lastIndexOf(5);//7

    al1.set(6, 100);//to change the value at the given index 

    System.out.println(al1);

    //Displaying all Elements
    for(int i = 0; i < al1.size();i++) {
      System.out.println(al1.get(i));
    }
    // using for each
    for(Integer x: al1) { // You can use var instead of Integer
      System.out.println(x);
    }

    //lambda Expression
    al1.forEach((x) -> {
      System.out.println(x);
    });

    //Iterator
    Iterator<Integer> it = al1.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    for(Iterator<Integer> it2 = al1.iterator();it2.hasNext();) {
      System.out.println(it2.next());
    }
    //list Iterator that allows bidirectional access
    ListIterator<Integer> it1 = al1.listIterator();
    while (it1.hasNext()) { 
      System.out.println(it1.next());
    }

    al1.forEach(n -> show(n)); // lambda Expression that shows that are greater than 60
    al1.forEach((n) -> { // same as the above
      show(n);
    });

    //! Linked List Implementation
    //! It is a Doubly Linked List
    LinkedList<Integer> ll1 = new LinkedList<>();

    LinkedList<Integer> ll2 = new LinkedList<>(List.of(50,60,70,80,90));

    //Adding Elements
    ll1.add(10);
    ll1.add(0,5);
    ll1.addAll(ll2);
    
    ll1.contains(50);//true
    ll1.equals(ll2); //false

    ll1.get(0);//5

    ll1.indexOf(5);//0 index
    ll1.add(5);
    ll1.lastIndexOf(5);//7

    ll1.set(6, 100);//to change the value at the given index 

    System.out.println(ll1);

    //Displaying all Elements
    for(int i = 0; i < ll1.size();i++) {
      System.out.println(ll1.get(i));
    }
    // using for each
    for(Integer x: ll1) { // You can use var instead of Integer
      System.out.println(x);
    }

    //lambda Expression
    ll1.forEach((x) -> {
      System.out.println(x);
    });

    //Iterator
    Iterator<Integer> it3 = ll1.iterator();
    while (it3.hasNext()) {
      System.out.println(it3.next());
    }

    for(Iterator<Integer> it4 = ll1.iterator();it4.hasNext();) {
      System.out.println(it4.next());
    }
    //list Iterator that allows bidirectional access
    ListIterator<Integer> it5 = ll1.listIterator();
    while (it5.hasNext()) { 
      System.out.println(it5.next());
    }

    ll1.forEach(n -> show(n)); // lambda Expression that shows that are greater than 60
    ll1.forEach((n) -> { // same as the above
      show(n);
    });

    //! Additional Ones in Linked List

    ll1.addFirst(4);
    ll1.addLast(120);

    ll1.peek();// Retrieves, but does not remove, the head (first element) of this list.
    ll1.poll();// retrieves and the removes the head(first) element

  }

  static void show(int n) {
    if(n > 60) {
      System.out.println(n);
    }
  }
}