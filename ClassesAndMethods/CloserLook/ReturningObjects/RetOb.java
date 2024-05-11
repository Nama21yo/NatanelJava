package ClassesAndMethods.CloserLook.ReturningObjects;

public class RetOb {
  public static void main(String[] args) {
    RetTest ob1 = new RetTest(2);
    RetTest ob2;
    ob2 = ob1.incrByTen();
    System.out.println("ob1.a: " + ob1.a);
    System.out.println("ob2.a: " + ob2.a);
    ob2 = ob2.incrByTen();
    System.out.println("ob2.a after second increase: "
    + ob2.a);
  }
}
// ob1.a: 2
//  ob2.a: 12
//  ob2.a after second increase: 22
