
  // Different Patterns in Java
// Reads Positive integer and displays based on N

import java.util.Scanner;

// class exercise_18 {
//     public static void main(String[] args) {
//       System.out.print("Enter a Number: ");
//       Scanner input = new Scanner(System.in);
//       int num = input.nextInt();

//         if (num > 0) {
//             for(int i = 1; i <= num; i++) {
//               for (int j = 0; j < i;j++) {
//                 System.out.print(i);        
//               }
//               System.out.println();
//             }
//         }
//         else {
//           System.out.println("Enter a Valid Number");
//         }
// // 1
// // 22
// // 333
// // 4444
// // 55555
// // 666666
//     }
//   }
  

public class patterns_08 {
    // Pattern 1
    static void pattern1(int n) {
    
    for (int row = 1; row <= n;row++) {
      for (int col = 1; col <= n; col++) {
        System.out.print("* ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
    // Pattern 2
    static void pattern2(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 0; col < row; col++) {
        System.out.print("* ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
    }
    // Pattern 3
    static void pattern3(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 1; col <= (n-row+1); col++) {
        System.out.print("* ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
    // Pattern 4
    static void pattern4(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
  // Pattern 5

  
    static void pattern5(int n) {
      // Method 1
    for (int row = 1; row <= (2*n-1);row++) {
      int totalColsinRow = row > n ? (n)-(row-n) : row;
      for (int col = 1; col <= totalColsinRow; col++) {
        System.out.print("* ");
      }
      
      // when one row is printed we need to add a newline
      System.out.println();
    }
    // Method 2
    for (int row = 0; row <= (2*n);row++) {
      int totalColsinRow = row > n ? (2*n)-(row) : row;
      for (int col = 0; col < totalColsinRow; col++) {
        System.out.print("* ");
      }
      
      // when one row is printed we need to add a newline
      System.out.println();
    }    
  }
  // Pattern 6
    static void pattern6(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 0; col < (n-row); col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= (row); col++) {
        System.out.print("* ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
  // Pattern 7
    static void pattern7(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 1; col < (row); col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= (n-row+1); col++) {
        System.out.print("* ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
  // Pattern 8
    static void pattern8(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 1; col <= (n-row); col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= (2*row-1); col++) {
        System.out.print("* ");
      }
      for (int col = 1; col <= (n-row); col++) {
        System.out.print("  ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
  // Pattern 9
    static void pattern9(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 0; col < (row); col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= ((2*n+1)-2*row); col++) {
        System.out.print("* ");
      }
      for (int col = 0; col < (row); col++) {
        System.out.print("  ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
  // Pattern 10
    static void pattern10(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col = 0; col < (n-row); col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= (row); col++) {
        System.out.print("* ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
  // Pattern 11
    static void pattern11(int n) {

    for (int row = 1; row <= n;row++) {
      for (int col=1; col <= row; col++) {
        System.out.print(" ");
      }
      for (int col = 0; col <= n-row; col++) {
        System.out.print("* ");
      }
      // when one row is printed we need to add a newline
      System.out.println();
    }
  }
  // Pattern 12
  //   static void pattern12(int n) {

  //   for (int row = 1; row <= n;row++) {
  //     for (int col=1; col <= row; col++) {
  //       System.out.print(" ");
  //     }
  //     for (int col = 0; col <= n-row; col++) {
  //       System.out.print("* ");
  //     }
  //     // when one row is printed we need to add a newline
  //     System.out.println();
  //   }       
  // }
  
  public static void main(String[] args) {
    System.out.print("Enter a Number: ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println("Pattern 1");
    pattern1(num);
    // System.out.println("Pattern 2");
    // pattern2(num);
    // System.out.println("Pattern 3");
    // pattern3(num);
    // System.out.println("Pattern 4");
    // pattern4(num);
    // System.out.println("Pattern 5");
    // pattern5(num);
    // System.out.println("Pattern 6");
    // pattern6(num);
    // System.out.println("Pattern 7");
    // pattern7(num);
    // System.out.println("Pattern 8");
    // pattern8(num);
    // System.out.println("Pattern 9");
    // pattern9(num);
    // System.out.println("Pattern 10");
    // pattern10(num);
    // System.out.println("Pattern 11");
    // pattern11(num);
    // System.out.println("Pattern 12");
    // pattern12(num);
  }
}
