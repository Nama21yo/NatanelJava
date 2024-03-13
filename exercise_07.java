// Loops Exercise
// Write a program which prints the even numbers between 1 and 100 in an increasing order

import java.util.Scanner;

class exercise_08 {
  public static void main(String[] args) {
    // Increasing Order
    for(int i=1;i<=100;i++) {
      if (i%2 == 0)
        System.out.print(i + " ");
      // else
      //   continue;
    }
    for(int j = 1;j <= 100; j += 2) {
        System.out.print(j + " ");
      // else
      //   continue;
    }

    int n = 1;
    while (n<=100) {
      if (n%2 == 0)
        System.out.println(n);
        n++;
      // else
      //   continue;
    }
      // Decreasing Order
    for(int x = 100;x>=1;x--){
      if (x%2 == 0)
        System.out.println(x);
      // else
      //   continue;
    }
    for(int j = 100;j >= 1; j -= 2) {
        System.out.print(j + " ");
      // else
      //   continue;
    }
    int y = 100;
    while (y>0) {
      if (y % 2 == 0)
        System.out.println(y);
        y--;
      // else
      // continue;
    }
  }
}

// Write a program which reads a sequence of integers from the user and stops by displaying "Done" when the sum of these values exceeds 100
class exercise_09 {
  public static void main(String[] args) {
    // System.out.println("Enter a Number");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int sum = 0;
    do {
        System.out.println("Enter a Number");
        sum +=num;
    }  while (sum < 100);
    System.out.println("Done" + sum);

  }
}
// Write a program that displays the sum of the stric divisors of an integer (6 = 1+2+3,10 = 1+2+5)
class exercise_10 {
  public static void main(String[] args) {
    // System.out.println("Enter a Number");
    Scanner input = new Scanner(System.in);
    int strict = input.nextInt();
    int sum = 1;
    for (int i = 2; i <= strict/2;i++) {
      if (strict % i == 0)
          sum += i;
    } 
    System.out.println(sum);//The strict divisor
    System.out.println(sum + strict);
    

  }
}
// check whether it is prime or not
class exercise_11 {
  public static void main(String[] args) {
    // System.out.println("Enter a Number");
    Scanner input = new Scanner(System.in);
    int prime = input.nextInt();
    boolean isPrime = true;//flag


    for (int i = 2; i <= prime/2;i++) {
      if (prime % i == 0) {
        isPrime = false;
        // System.out.println("It isn't Prime");
        break;
      }
      System.out.println(isPrime ? "It is Prime" : "It isn't Prime");

      
    }
    // Method 2
    Scanner inp = new Scanner(System.in);
    int prim = inp.nextInt();
    int sum = 1;
    
    for (int i = 2; i <= prim/2;i++) {
      if (prim % i == 0)
        sum +=i;
    }
    System.out.println(sum == 1 ? "It is Prime" : "It isn't Prime");
  }
}
// Write a program which reads a sequence of positive integers. The program stops when the user fills a negative value and shows the maximum and the minimum of these numbers.(6 0 5 7 -1 -> max =7,min=0)
class exercise_12 {
  public static void main(String[] args) {
    // System.out.println("Enter a Number");
    Scanner input = new Scanner(System.in);
    int first_num = input.nextInt();
    int max = first_num;
    int min = first_num;
    if (first_num > 0) {
      while (true) {
        int num2 = input.nextInt();
        if (num2 < 0)
        break;// The position ofthe numbers is ver importatnt
        // if (num2 > max)
        //   max = num2;
        // if (num2 < min)
        //   min = num2;
        max = num2 > max ? num2 : max;
        min = num2 < min ? num2 : min;
      }
      System.out.println("max: " + max + " , min: " + min );
    }
    else
      System.out.println("Number is invalid");


  }
}
//  Sum of  a digit (12345=>15, 123=>6)
  class exercise_13 {
   public static void main(String[] args) {
              // System.out.println("Enter a Number");
              Scanner input = new Scanner(System.in);
              int number = input.nextInt();
              int sum = 0;

              while (number > 0){
                sum = (sum) + number % 10; 
                number = number / 10;
              }

              System.out.println("sum " + sum);
          
  }
  }
  // Fibonacci Sequence(Write a program that reads an integer n and displays the nth Fibonacci number)
  class exercise_14 {
   public static void main(String[] args) {
        System.out.print("Enter a Positive Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int v1 = 1;
        int v2 = 1;
        int start = 0;
        for (int i =0; i < n-2;i++) {
          start = v1 + v2;
          v1 = v2;
          v2 = start;
        }
        System.out.println("The " + n + "th fibonacci = " + (start ==0 ? 1 : start));
    }
  }
  // Write a Program which displays a string with a space after each character 
  // (ab cd => a b  c d) (some text => s o m e  t e x t)
  class exercise_15 {
   public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for (int i = 0;i < str.length();i++) {
          System.out.print(str.charAt(i) + " ");
        }
    }
  }
// Write a program that displays the reverse of a string (abcd => dcba)
  class exercise_16 {
   public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        String reverse = "";
       for (int i = (str.length()-1);i >= 0;i--) {
        reverse += str.charAt(i); 
        }
        System.out.print(reverse);
    }
  }
  // Write a program which finds if a string is palindrome string or not (noon)
  class exercise_17 {
   public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        boolean isPalindrome = true;
        
        // String reverse = "";

        
        // for (int i=0; i<str.length();i++) {
        //   // reverse += str.charAt(i);
        //   if (str.charAt(i) != str.charAt(str.length()-1-i)) {
        //       isPalindrome = false;
        //     }
        // }
        for (int i=0,j=str.length()-1; i<j;i++,j--) {
          // reverse += str.charAt(i);
          if (str.charAt(i) != str.charAt(j)) {
              isPalindrome = false;
            }
        }
        System.out.println(isPalindrome ? "Palindrome":"Not Palindrome");

      // str == reverse ? "Palndirome" : "Not Palindrome";
      // if (str == reverse) {
      //   System.out.println("Palindrome");
      // }
      // else {
      //   System.out.println("Not Palindrome");
      // }
    }
  }



