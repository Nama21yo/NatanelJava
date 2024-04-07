//! Object Oriented Programming
class stack {
  int[] stck = new int[10];
  int index;

  //TODO- CONSTRUCTOR
// A constructor initializes an object immediately upon creation. It has the same name as 
// the class in which it resides and is syntactically similar to a method. Once defined, the 
// constructor is automatically called when the object is created, before the new operator 
// completes. Constructors look a little strange because they have no return type, not even 
// void. This is because the implicit return type of a class’ constructor is the class type itself. 
// It is the constructor’s job to initialize the internal state of an object so that the code creating 
// an instance will have a fully initialized, usable object immediately.
  stack(){
    System.out.println("Constructor is created");
    index = -1;
  }

  void push(int item){
    if(index==9){
      System.out.println("Stack is Full");
    }
    else{
      stck[++index] = item;
    }
  }
  int pop(){
    if(index<0){
      System.out.println("Stack Underflow");
      return 0;
    }
    else{
      return stck[index--];
    }
  }
}
class Teststack {
  public static void main(String[] args) {
    stack stack1 = new stack();
// new Box( ) is calling the Box( ) constructor. When you do not explicitly define a constructor 
// for a class, then Java creates a default constructor for the class. This is why the preceding line 
// of code worked in earlier versions of Box that did not define a constructor. When using the 
// default constructor, all non-initialized instance variables will have their default values, which 
// are zero, null, and false, for numeric types, reference types, and boolean, respectively. The 
// default constructor is often sufficient for simple classes, but it usually won’t do for more 
// sophisticated ones. Once you define your own constructor, the default constructor is no 
// longer used.
    stack stack2 = new stack();

    //Push some Numbers
    for(int i =0;i<10;i++){
      stack1.push(i);
    }
    for(int i = 10;i<20;i++){
      stack2.push(i);
    }
    //Pop some Numbers
    System.out.println("stack1");
    for(int i = 0;i<10;i++){
      System.out.println(stack1.pop());
    }
    System.out.println("stack2");
    for(int i = 0;i<10;i++){
      System.out.println(stack2.pop());
    }
  }
}