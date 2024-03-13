
  // Different Patterns in Java
// Reads Positive integer and displays based on N

import java.util.Scanner;

class exercise_18 {
    public static void main(String[] args) {
      System.out.print("Enter a Number: ");
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();

        if (num > 0) {
            for(int i = 1; i < num; i++) {
               System.out.println("");
              for (int j = 0; j<i;j++) {
                System.out.print(i);
               
              }
            }
        }
        else {
          System.out.println("Enter a Valid Number");
        }
// 1
// 22
// 333
// 4444
// 55555
// 666666
    }
  }

