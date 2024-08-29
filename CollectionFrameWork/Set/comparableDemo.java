package CollectionFrameWork.Set;

import java.util.*;

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int marks;

    // Constructor
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Overriding compareTo method to define natural ordering based on marks
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // Ascending order of marks
        // return other.marks - this.marks; // Uncomment this line for descending order
    }

    @Override
    public String toString() {
        return "Student{" + 
               "rollNo=" + rollNo + 
               ", name='" + name + '\'' + 
               ", marks=" + marks + '}';
    }
}

public class comparableDemo {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Alice", 85));
        students.add(new Student(102, "Bob", 92));
        students.add(new Student(103, "Charlie", 75));
        students.add(new Student(104, "David", 60));
        students.add(new Student(105, "Eve", 89));

        System.out.println("Students before sorting:");
        students.forEach(System.out::println);

        // Sorting the list using the compareTo method defined in Student
        Collections.sort(students);

        System.out.println("\nStudents after sorting by marks (ascending):");
        students.forEach(System.out::println);

        // To sort in descending order, you can use a custom Comparator
        Collections.sort(students, Collections.reverseOrder());

        System.out.println("\nStudents after sorting by marks (descending):");
        students.forEach(System.out::println);
    }
}
