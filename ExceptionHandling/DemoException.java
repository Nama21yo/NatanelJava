package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

// Throwable
    // Exception
        //Checked
            //  IO Exception
            //  SQL Exception
        //Unchecked 
            // Runtime Exception(ArraysOutOfBound, FileNotFound)
                // ArithmeticException
                // java.lang.ArrayIndexOutOfBoundsException:
                // 
    // Error
// 1.Unchecked: occurs during run time
// 2.Checked Exceptions:occurs during the compile time. 
// needs to be handled IMMEDIATELY
// Exception handling: try & catch: blocks, used for handling the exception 
 
// throws keyword is used within the method signature 
// disadvantage is: throws keyword whoever calls the method 
// will have to handle the exception again but with 
// try/catch you handle once. Try/catch is better way to handle it 
// in utility class. Next time you call method you don’t get any exceptions
 
// most common Exception like NullPointerExceptio, 
// ArrayIndexOutOfBound, ClassNotFoundException, IOException.
// are unchecked and they are descended from java.lang.RuntimeException
// In Selenium: nosuchelement, nostaleexception, nosuchaframe 
// In SQL: SQL exception 


//  - ArithmeticException 
//     It is thrown when an exceptional condition has occurred in an arithmetic operation.
    
//     - ArrayIndexOutOfBoundsException 
//     It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
    
//     - ClassNotFoundException 
//     This Exception is raised when we try to access a class whose definition is not found
    
//     - FileNotFoundException 
//     This Exception is raised when a file is not accessible or does not open.
    
//     - IOException 
//     It is thrown when an input-output operation failed or interrupted
    
//     - InterruptedException 
//     It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.
    
//     - NoSuchFieldException 
//     It is thrown when a class does not contain the field (or variable) specified
    
//     - NoSuchMethodException 
//     It is thrown when accessing a method which is not found.
    
//     - NullPointerException 
//     This exception is raised when referring to the members of a null object. Null represents nothing
    
//     - NumberFormatException 
//     This exception is raised when a method could not convert a string into a numeric format.
    
//     - RuntimeException 
//     This represents any exception which occurs during runtime.
    
//     - StringIndexOutOfBoundsException 
//     It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string
public class DemoException {
  public static void main(String[] args) throws IOException {
    int i,j,k=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    i = 8;
    
    int a[] = new int[4];
    try{
      System.out.println("Enter a Number: ");
      j = Integer.parseInt(br.readLine());

      k = i/j;//as soon as it got the error it will go to catch
      // for (int l = 0; l <= a.length; l++) {
      //   a[l] = l+1;
      // }

    System.out.println("Output is: "+k);


      
    }catch(IOException ex) {
      System.out.println("Some IO Error");
    }
    catch(ArithmeticException ex){//Unchecked
      System.out.println("We can't divide a number by zero");
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Maximum number is 4" + e);
    }
    catch(Exception e) {
      System.out.println("Unknown Exception");
    }finally {
      br.close();
      System.out.println("BYE");
    }
  } //java.lang.ArithmeticException:
}
