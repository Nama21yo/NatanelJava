class ifElse1 {
  // For only One statement
  public static void main(String[] args) {
    int x = 8;
    int y = 7;

    if(x>y)
      System.out.println(x);
    else
      System.out.println(y);
  }
}
class ifElse2 {
  // For more than One statement
  public static void main(String[] args) {
    int x = 8;
    int y = 7;

    if(x>y) {
      System.out.println(x);
      System.out.print("\nThank You");
    }
    else
      System.out.println(y);
  }
}

// Demonstrate if-else-if statements.
class IfElse {
 public static void main(String[] args) {
    int month = 4; // April
    String season;

    if(month == 12 || month == 1 || month == 2)
      season = "Winter";
    else if(month == 3 || month == 4 || month == 5)
      season = "Spring";
    else if(month == 6 || month == 7 || month == 8)
      season = "Summer";
    else if(month == 9 || month == 10 || month == 11)
      season = "Autumn";
    else
      season = "Bogus Month";
    System.out.println("April is in the " + season + ".");//April is in the Spring.
 }
}

// A simple example of the switch.
class SampleSwitch {
 public static void main(String[] args) {
    for(int i=0; i<6; i++)
        switch(i) {
              case 0:
                System.out.println("i is zero.");
                break;
              case 1:
                System.out.println("i is one.");
                break;
              case 2:
                System.out.println("i is two.");
                break;
              case 3:
                System.out.println("i is three.");
                break;
              default:
                System.out.println("i is greater than 3.");
    }//Output
//  i is zero.
//  i is one.
//  i is two.
//  i is three.
//  i is greater than 3.
//  i is greater than 3.

 }
}

// In a switch, break statements are optional.
class MissingBreak {
 public static void main(String[] args) {
 for(int i=0; i<12; i++)
    switch(i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
              System.out.println("i is less than 5");
              break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
              System.out.println("i is less than 10");
              break;
            default:
              System.out.println("i is 10 or more");
    }//output
//  i is less than 5
//  i is less than 5
//  i is less than 5
//  i is less than 5
//  i is less than 5
//  i is less than 10
//  i is less than 10
//  i is less than 10
//  i is less than 10
//  i is less than 10
//  i is 10 or more
//  i is 10 or more
 }
}


// An improved version of the season program.
class Switch {
 public static void main(String[] args) {
    int month = 4;
    String season;
    switch (month) {
        case 12:
        case 1:
        case 2:
          season = "Winter";
          break;
        case 3:
        case 4:
        case 5:
          season = "Spring";
          break;
        case 6:
        case 7:
        case 8:
          season = "Summer";
          break;
        case 9:
        case 10:
        case 11:
          season = "Autumn";
          break;
        default:
          season = "Bogus Month";
    }
    System.out.println("April is in the " + season + ".");
    }
}

// Use a string to control a switch statement.
class StringSwitch {
 public static void main(String[] args) {
      String str = "two";
      switch(str) {
        case "one":
          System.out.println("one");
          break;
        case "two":
          System.out.println("two");
          break;
        case "three":
          System.out.println("three");
          break;
        default:
          System.out.println("no match");
          break;
      }
      //Output: two
 }
}

// Ternary Operators
class ternary {
  public static void main(String[] args) {
    // With if Condition
    // Even and Odd
    int n =4;
    // if(n%2==0)
    //     System.out.println("n is Even");
    // else
    //   System.out.println("n is Odd");
    // This is the same as:

    String k = n%2==0 ? "n is Even":"n is Odd";
    System.out.println(k);
  }
}


//Iteration loops
// Demonstrate the while loop.
class While {
 public static void main(String[] args) {
    int n = 10;
        while(n > 0) {
          System.out.println("tick " + n);
          n--;
        }
//  tick 10
//  tick 9
//  tick 8
//  tick 7
//  tick 6
//  tick 5
//  tick 4
//  tick 3
//  tick 2
//  tick 1
 }
}

// The target of a loop can be empty.
class NoBody {
 public static void main(String[] args) {
    int i, j;
    i = 100;
    j = 200;
    // find midpoint between i and j
    while(++i < --j); // no body in this loop
    System.out.println("Midpoint is " + i);
    //This  procedure only works when i is less than j to begin with.
    //Output: Midpoint is 150
 }
}

// Using a do-while to process a menu selection
class Menu {
 public static void main(String[] args)
      throws java.io.IOException {
      char choice;
      do {
          System.out.println("Help on: ");
          System.out.println(" 1. if");
          System.out.println(" 2. switch");
          System.out.println(" 3. while");
          System.out.println(" 4. do-while");
          System.out.println(" 5. for\n");
          System.out.println("Choose one:");
          choice = (char) System.in.read();
      } while( choice < '1' || choice > '5');

      System.out.println("\n");

      switch(choice) {
          case '1':
            System.out.println("The if:\n");
            System.out.println("if(condition) statement;");
            System.out.println("else statement;");
            break;
          case '2':
            System.out.println("The switch:\n");
            System.out.println("switch(expression) {");
            System.out.println(" case constant:");
            System.out.println(" statement sequence");
            System.out.println(" break;");
            System.out.println(" //...");
            System.out.println("}");
            break;
          case '3':
            System.out.println("The while:\n");
            System.out.println("while(condition) statement;");
            break;
          case '4':
            System.out.println("The do-while:\n");
            System.out.println("do {");
            System.out.println(" statement;");
            System.out.println("} while (condition);");
            break;
          case '5':
            System.out.println("The for:\n");
            System.out.print("for(init; condition; iteration)");
            System.out.println(" statement;");
            break;
      }
      }
}


// Demonstrate the for loop.
class ForTick1 {
 public static void main(String[] args) {
 int n;

 for(n=10; n>0; n--)// no need of curlyBraces for one statement
    System.out.println("tick " + n);
 }
}

// Declare a loop control variable inside the for.
class ForTick2 {
 public static void main(String[] args) {
 // here, n is declared inside of the for loop
 for(int n=10; n>0; n--)
    System.out.println("tick " + n);
 }
}