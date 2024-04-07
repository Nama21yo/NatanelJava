import java.util.Scanner;
public class Array_10 {
  public static void main(String[] args) {
    System.out.println("Arrays");
  }
}
//! Temprature Readings
class TemperatureReadings {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        // create array
        double[] temperature;
        temperature = new double[7];
        // enter temperatures
        for (int i = 0; i < temperature.length; i++)
        {
          System.out.println("enter max temperature for day " + (i+1));
          temperature[i] = keyboard.nextDouble();
        }
        // display temperatures
        System.out.println(); // blank line
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println(); // blank line
        for (int i = 0; i < temperature.length; i++)
        {
          System.out.println("day "+(i+1)+" "+ temperature[i]);
        }
    }
}
//! Temprature Readings 2
class TemperatureReadings2 {
  public static void main(String[] args)
      {
      double[] temperature;
      temperature = new double[7]; 
      enterTemps(temperature); // call method
      displayTemps(temperature); // call method
      }
      // method to enter temperatures 
      static void enterTemps(double[] temperatureIn)
      {
        Scanner keyboard = new Scanner(System.in); 
        for (int i = 0; i < temperatureIn.length; i++)
        {
        System.out.println("enter max temperature for day " + (i+1)); 
        temperatureIn[i] = keyboard.nextDouble();
        }
      }
      // method to display temperatures 
      static void displayTemps(double[] temperatureIn)
      {
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***"); 
        System.out.println(); 
        for (int i = 0; i < temperatureIn.length; i++)
        {
        System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
      }
  }
}
class DisplayTemperaturesWithVarargs
{
    public static void main(String[] args)
        {
        double[] temperature = {7.5, 8.2, 7.7, 11.3, 10.75}; // create array with 5 readings
        System.out.println("Sending Array");
        displayTemps(temperature); // call method with a single array
        System.out.println();
        System.out.println("Sending individual items");
        displayTemps(7.5, 8.2, 7.7, 11.3, 10.75); // call method with 5 individual readings
        displayTemps(9.9); // call method with 1 value only
        displayTemps( ); // call method with no values
        }
        // method to display temperatures using varargs
    static void displayTemps(double... temperatureIn)
    {
            System.out.println();
            System.out.println("***TEMPERATURES***"); 
            System.out.println("Number of temperatures: "+ temperatureIn.length); // count items
            // display temperatures
            for (int i = 0; i < temperatureIn.length; i++)
            {
              System.out.println(temperatureIn[i]+ " ");
            }
    }
}
//! Temprature Readings 2
class TemperatureReadings3
{
    public static void main(String[] args)
        {
        double[] temperature ; 
        temperature = enterTemps(); // call new version of this method
        displayTemps(temperature);
        }
        // method to enter temperatures returns an array 
      static double[] enterTemps()
        { 
        Scanner keyboard = new Scanner(System.in); 
        double[] temperatureOut = new double[7]; 
        for (int i = 0; i < temperatureOut.length; i++)
        {
        System.out.println("enter max temperature for day " + (i+1)); 
        temperatureOut[i] = keyboard.nextDouble();
        }
        return temperatureOut;
      }
        // this method is unchanged 
      static void displayTemps(double[] temperatureIn)
        {
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***"); 
        System.out.println();
        for (int i = 0; i < temperatureIn.length; i++)
        {
        System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
        // dipslay items using enhanced for loop
        for (double item: temperatureIn)
        {
          System.out.println(item+ " ");
        }
      }
    }
}
//! Some Useful Array Methods
 class SomeUsefulArrayMethods
{
public static void main (String[] args)
{
            char choice;
            Scanner keyboard = new Scanner(System.in);
            int[] someArray; // declare an integer array
            System.out.print("How many elements to store?: ");
            int size = keyboard.nextInt();
            // size the array
            someArray = new int [size];
            // menu
            do
            {
                  System.out.println();
                  System.out.println("[1] Enter values");
                  System.out.println("[2] Find maximum");
                  System.out.println("[3] Calculate sum");
                  System.out.println("[4] Check membership");
                  System.out.println("[5] Search array");
                  System.out.println("[6] Display values");
                  System.out.println("[7] Exit");
                  System.out.print("Enter choice [1-7]: ");
                  choice = keyboard.next().charAt(0);
                  System.out.println();
                  // process choice by calling additional methods
                  switch(choice)
                  {
                  case '1': fillArray(someArray);
                  break;
                  case '2': int max = max(someArray);
                  System.out.println("Maximum array value = " + max); break;
                  case '3': int total = sum(someArray);
                  System.out.println("Sum of array values = " + total); break;
                  case '4': System.out.print ("Enter value to find: ");
                  int value = keyboard.nextInt();
                  boolean found = contains(someArray, value);
                  if (found)
                  {
                  System.out.println(value + " is in the array");
                  }
                  else
                  {
                  System.out.println(value + " is not in the array");
                  }
                  break;
                  case '5': System.out.print ("Enter value to find: ");
                  int item = keyboard.nextInt();
                  int index = search(someArray, item);
                  if (index == -999) // indicates value not found
                  {
                  System.out.println ("This value is not in the array");
                  }
                  else
                  {
                  System.out.println ("This value is at array index " + index);
                  }
                  break;
                  case '6': System.out.println("Array values");
                  displayArray(someArray);
                  break;
            }
            } while (choice != '7');
                System.out.println("Goodbye");
            }
            // additional methods
            // fills an array with values
        static void fillArray(int[] arrayIn)
        {
            Scanner keyboard = new Scanner (System.in);
            for (int i = 0; i < arrayIn.length; i++)
            {
             System.out.print("enter value ");
            arrayIn[i] = keyboard.nextInt();
            }
        }
            // returns the total of all the values held within an array
        static int sum (int[] arrayIn)
        {
            int total = 0;
            for (int currentElement : arrayIn)
            {
            total = total + currentElement;
            }
            return total;
            }
            // returns the maximum value in an array
        static int max (int[] arrayIn)
        {
            int result = arrayIn[0]; // set result to the first value in the array
            // this loops runs from the 2nd item to the last item in the array
            for (int i=1; i < arrayIn.length; i++)
            {
            if (arrayIn[i] > result)
            {
              result = arrayIn[i]; // reset result to new maximum
            }
            }
            return result;
        }
            // checks if a given item is contained within the array
        static boolean contains (int[] arrayIn, int valueIn)
            {
            // enhanced 'for' loop used here
            for (int currentElement : arrayIn)
            {
            if (currentElement == valueIn)
            {
             return true; // exit loop early if value found
            }
            }
              return false; // value not present
            }
            /* returns the position of an item within an array or -999 if the value is not present within the array */
        static int search (int[] arrayIn, int valueIn)
        {
            for (int i = 0; i < arrayIn.length; i++)
            {
            if (arrayIn[i] == valueIn)
            {
              return i;
            }
            }
              return -999;
            }
            // displays the array values on the screen
        static void displayArray(int[] arrayIn)
        {
            System.out.println();
            // standard 'for' loop used here as the array index is required
            for (int i = 0; i < arrayIn.length; i++)
            {
              System.out.println("array[" + i + "] = " + arrayIn[i]);
            }
            }
}

//! Duplicate Program(My First Trial and Error Program)
class Arraymethods {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How many elements to store?: ");
    int size = input.nextInt();
    int[] arr = new int[size];
    int choice;
    do{
      System.out.println();
      System.out.println("[1] Enter values");
      System.out.println("[2] Find Maximum");
      System.out.println("[3] Calculate Sum");
      System.out.println("[4] Check MemberShip");
      System.out.println("[5] Search Array");
      System.out.println("[6] Display Values");
      System.out.println("[7] Exit");
      System.out.print("Which One is Your choice?: ");
      choice = input.next().charAt(0);
      System.out.println();
      switch(choice) {
        case '1':
          FillArray(arr);
          break;
        case '2':
          System.out.println("The Maximum Element is: "+ maxElement(arr));
          break;
        case '3':
          System.out.println("Total Summation: "+ sumArray(arr));
          break;
        case '4':
          System.out.println("Enter the Number to Search:");
          System.out.println(checkMembership(arr, input.nextInt()) ? "It exists":"It doesn't exist");
          break;
        case '5':
          System.out.println("Enter the Number to Search: ");
          int index = SearchArray(arr,input.nextInt());
          System.out.println(index==-1 ? "Element not Found":("Element is Found at " + index));
          break;
        case '6':
          displayValues(arr);
          break;
      }
    }
    while (choice != '7');
      System.out.println("Good Bye");;
  }
  static void FillArray(int[] arr) {
    Scanner input = new Scanner(System.in);
    for(int i  = 0;i<arr.length;i++) {
      System.out.println("You choosed to Enter Value Enter Values: ");
      arr[i] = input.nextInt();
    }
  }
  static int maxElement(int[] arr){
    int max = arr[0];
    for(int i = 0;i < arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }
  static int sumArray(int[] arr){
    int total = 0;
    for(int currentElement:arr){
      total += currentElement;
    }
    return total;
  }
  static boolean checkMembership(int[] arr,int valuIn){

    for(int i = 0;i<arr.length;i++){
      if(arr[i]==valuIn){
        return true;
      }
    }
    return false;
  }
  static int SearchArray(int[] arr,int valueIn){

    for(int i =0;i<arr.length;i++){
      if(arr[i]==valueIn){
        return i;
      }
    }
    return -1;
  }
  static void displayValues(int[] arr){
    System.out.println();
    for(int i = 0;i< arr.length;i++){
      System.out.println("array["+i+"]  = "+arr[i]);
    }
  }
}

// System.out.println("[1] Enter temperatures");
// System.out.println("[2] Display all");
// System.out.println("[3] Display one week");
// System.out.println("[4] Display day of the week");
// System.out.println("[5] Exit");
