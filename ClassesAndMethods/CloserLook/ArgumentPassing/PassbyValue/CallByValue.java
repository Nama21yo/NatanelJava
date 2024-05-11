package ClassesAndMethods.CloserLook.ArgumentPassing.PassbyValue;

class CallByValue {
  public static void main(String[] args) {
    ValueTest ob = new ValueTest();
    int a = 15;
    int b = 20;

    System.out.println("a and b before call: " + a + " " + b);
    ob.meth(a, b);
    System.out.println("a and b after call: " + a + " " + b);
  }
}
// a and b before call: 15 20
// a and b after call: 15 20
