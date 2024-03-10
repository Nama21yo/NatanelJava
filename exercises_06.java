                  // Conditional Statement
// Create a calculator(+,-,*,/)

import java.util.Scanner; //java knows the scanner in java.util

class exercises_01 {
  public static void main(String[] args) {
    
    double answer = calculator(3,'=',7);
    if (answer == 0)
        System.out.println("Please Enter Valid Operator");
    else {
      System.out.println("The result is: ");
      // void java.io.PrintStream.println(double answer);
      System.out.println(answer);
    }



  }
  public static double calculator(double a,char b, double c) {
    // if (b == '+') {
    //   return (a+c); 
    // }
    // else if (b == '-') {
    //   return (a-c);
    // }
    // else if (b == '*') {
    //   return (a*c);
    // }
    // else if (b == '/') {
    //   return (a/c);
    // }
    // else {
    //   return 0;
    // }
    switch(b) {
      case '+':
        return (a+c); 
      case '-':
        return (a-c); 
      case '*':
        return (a*c); 
      case '/':
        return (a/c); 
      default:
        return 0;
      }
  }
}
// Method 2

class exercises_02 {
  // The Scanner Method
  public static void main(String[] args){
      // Scanner input = new Scanner(System.in);
      // Scanner input = new Scanner(System.in);
      // input.next();//Read a String and only reads after the first space
      // input.nextLine();// Read a string with spaces as a full sentence
      // input.nextInt();// Read an Integer
      // also we have nextDouble(), nextShort(),nextByte(),nextBoolean()
      // we don't have nextchar()
      System.out.print("Enter num1 operator num2 (5 * 7)");
      Scanner input = new Scanner(System.in);
      double d1 = input.nextDouble();
      char operator = input.next().charAt(0);
      double d2 = input.nextDouble();

      if (operator == '+')
        System.out.println((int)(d1+d2));
      else if (operator == '-')
        System.out.println((int)(d1-d2));
      else if (operator == '/')
        System.out.println(d1/d2);
      else if (operator == '*')
        System.out.println((int)(d1*d2));
      else
        System.out.println("Please Enter Valid Operator");

  }
}
// Lucky Number Input 4 digit Number - eg 3719 output 3+7 =1+9 =>Lucky Number
class exercises_03 {
  /**
  //  * @param args
   */
  public static void main(String[] args) {
    System.out.print("Enter a four digit number: ");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();//3719
    if (!(x>999 && x<10000)) {
      System.out.println("Enter a valid Number");
    }
    else {
      int a = x % 100;//19
      int b = x / 100;//37
      int sum1 = 0;
      int sum2 = 0;
      for (int i = 0;i < 2;i++){
         sum1 = sum1 + (a%10);//0+9 then 9+1
         sum2 = sum2 + (b%10);//0+7 then 7+3
          a /= 10;
          b /= 10;
      }
      if (sum1 == sum2) 
        System.out.println("It is Lucky Number");
      else
        System.out.println("It is Unlucky Number");

    }
  }
}
//Method 2
class exercises_04 {
public static void main(String[] args) {
    System.out.print("Enter a four digit number: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();//3719
    if (!(n>999 && n<10000)) {
      System.out.println("Enter a Valid Number");
    }
    else {
      int lastDigit = n % 10;
      int thirdDigit = (n/10) % 10;
      int secondDigit = (n/100) % 10;
      int firstDigit = (n/1000) % 10;
  
      if (firstDigit+secondDigit==thirdDigit+lastDigit) 
        System.out.println("It is Lucky Number");
      else
        System.out.println("It is Unlucky Number");
    }
}
}

