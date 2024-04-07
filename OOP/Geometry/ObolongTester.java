import java.util.Scanner;

public class ObolongTester {
  public static void main(String[] args) {
    Obolong obj1 = new Obolong(13,34);
    Obolong obj2 = new Obolong(124,326);
    //Original
    System.out.println(obj1.getLength());
    System.out.println(obj1.getHeight());
    // obj1.length = 56;//This will cause an Error if it is private
    obj1.setLength(56);
    obj1.setHeight(-2143);//Using Invalid Input
    System.out.println(obj1.getLength());
    System.out.println(obj1.getHeight());

    //? Taking Inputs from Keyboard
    Scanner keyboard = new Scanner(System.in);
    // declare two variables to hold the length and height of the Oblong as input by the user 
    double oblongLength, oblongHeight;
    // declare a reference to an Oblong object
    // now get the values from the user
    System.out.print("Please enter the length of your Oblong: ");
    oblongLength = keyboard.nextDouble();
    System.out.print("Please enter the height of your Oblong: ");
    oblongHeight = keyboard.nextDouble();
    // create a new Oblong object
    Obolong myOblong = new Obolong(oblongLength, oblongHeight);
    /* use the various methods of the Oblong class to display the length, height, area and 
    perimeter of the Oblong */
    System.out.println("Oblong length is " + myOblong.getLength());
    System.out.println("Oblong height is " + myOblong.getHeight());
    System.out.println("Oblong area is " + myOblong.calculateArea());
    System.out.println("Oblong perimeter is " + myOblong.calculatePerimeter());
  }
}
