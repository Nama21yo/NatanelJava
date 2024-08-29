package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Try with resources
public class InputDemo {
  public static void main(String[] args) throws Exception{
    String str = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    str = br.readLine();

    

    br.close();    
  }
}

// class Test
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             int a[]= {1, 2, 3, 4};
//             for (int i = 1; i <= 4; i++)
//             {
//                 System.out.println(\"a[\" + i + \"]=\" + a[i] + \"\\n\");
//             }
//         }
        
//         catch (Exception e)
//         {
//             System.out.println("error = " + e);
//         }
        
//         catch (ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println(\"ArrayIndexOutOfBoundsException\");
//         }
//     }
// }
// Compiler error

// Run time error

// ArrayIndexOutOfBoundsException
// Wrong
// Error Code is printed

// Array is printed
// Discuss it
// Question 3 ‒ Explanation

// ArrayIndexOutOfBoundsException has been already caught by base class Exception. When a subclass exception is mentioned after base class exception, then error occurs.


// class Test
// {
//     public static void main (String[] args)
//     {
//         try
//         {
//             int a = 0;
//             System.out.println (\"a = \" + a);
//             int b = 20 / a;
//             System.out.println (\"b = \" + b);
//         }

//         catch(ArithmeticException e)
//         {
//             System.out.println (\"Divide by zero error\");
//         }

//         finally
//         {
//             System.out.println (\"inside the finally block\");
//         }
//     }
// }

// Compile error

// Divide by zero error
// Right
// a = 0
// Divide by zero error
// inside the finally block

// a = 0

// inside the finally block
// Discuss it
// Question 4 ‒ Explanation

// On division of 20 by 0, divide by zero exception occurs and control goes inside the catch block. Also, the finally block is always executed whether an exception occurs or not.


