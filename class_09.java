//! A class creates a new data type that can be used to create objects. That is, a class creates a logical framework that defines the relationship between its members. When you declare an object of a class, you are creating an instance of that class. Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.) It is important to keep this distinction clearly in mind.
class Boxs {//!It is creating new datatype(CLASS)
  double width;//instance Variables
  double height;
  double depth;
  //Creating a method of Area
  public double Area(double w,double h){
    double area = width*height;
    return area;
  }
    //Creating a method of Volume
  public double volume(double h,double w,double d) {
    double vol = height*width*depth;
    return vol;
  }
}
public class class_09 {
  public static void main(String[] args) {
    //!A variable does not define an object. 
// Instead, it is simply a variable that can refer to an object. 
//Second, you must acquire an actual, physical copy of the object and assign it to that variable. You can do this using the new operator.
//! The new operator dynamically allocates (that is, allocates at run time) memory for an object and returns a reference to it. This reference is, essentially, the address in memory of the object allocated by new. This reference is then stored in the variable. Thus, in Java, all class objects must be dynamically allocated. 
    Boxs myBox = new Boxs();//!(OBJECT)
// The class name followed by parentheses specifies the constructor for the class. A constructor defines what occurs when an object of a class is created. Constructors are an important part of all classes and have many significant attributes. Most real-world classes explicitly define their own constructors within their class definition. However, if no explicit constructor is specified, then Java will automatically supply a default constructor. This is the case with Box. For now, we will use the default constructor. Soon, you will see how to define your own constructors.
//t is important to understand that new allocates memory for an object during run time. The advantage of this approach is that your program can create as many or as few objects as it needs during the execution of your program. However, since memory is finite, it is possible that new will not be able to allocate memory for an object because insufficient memory exists. If this happens, a run-time exception will occur.
    // assign values to mybox's instance variables
    myBox.width = 10;
    myBox.height = 20;
    myBox.depth = 15;
    System.out.println("Area is " + myBox.Area(myBox.width,myBox.height));
    System.out.println("Volume is " + myBox.volume(myBox.width,myBox.height,myBox.depth));
    
  }
}

// This program declares two Box objects.
//  It is 
// important to understand that changes to the instance variables of one object have no 
// effect on the instance variables of another.
//Buffer Reader(input Stream Reader and File Reader)
//java.io.BufferReader
//java.io.inputStreamReader
//io.Filereader
//! The above code is troubling for two reasons. First, it is clumsy and error prone. For example, it would be easy to forget to set a dimension. Second, in well-designed Java programs, instance variables should be accessed only through methods defined by their class. In the future, you can change the behavior of a method, but you can’t change the behavior of an exposed instance variable.
//TODO- A better approach to setting the dimensions of a box is to create a method that takes the dimensions of a box in its parameters and sets each instance variable appropriately.
// This program uses a parameterized method.
class Box {
  //creating Instance Variables
 double width;
 double height;
 double depth;
 // compute and return volume
 double volume() {
 return width * height * depth;
 }
 // sets dimensions of box
 void setDim(double w, double h, double d) {
 width = w;
 height = h;
 depth = d;
 }
}
class BoxDemo5 {
 public static void main(String[] args) {
 Box mybox1 = new Box();
 Box mybox2 = new Box();
 double vol;
 // initialize each box
 mybox1.setDim(10, 20, 15);
 mybox2.setDim(3, 6, 9);
 // get volume of first box
 vol = mybox1.volume();
 System.out.println("Volume is " + vol);
 // get volume of second box
 vol = mybox2.volume();
 System.out.println("Volume is " + vol);
 }
}