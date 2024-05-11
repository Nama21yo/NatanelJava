package ClassesAndMethods.CloserLook.ArgumentPassing.PassbyReference;

public class PassObjRef {
  public static void main(String[] args) {
    RefTest ob = new RefTest(15, 20);

    System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
    ob.meth(ob);
    System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
  }
}

// ob.a and ob.b before call: 15 20
// ob.a and ob.b after call: 30 10

//! REMEMBER When an object reference is passed to a method, the reference itself is passed by use of call-by value. However, since the value being passed refers to an object, the copy of that value will still refer to the same object that its corresponding argument does.