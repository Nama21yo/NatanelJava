class Overload {
  public static void main(String[] args) {
  OverloadDemo ob = new OverloadDemo();
  double result;
  // call all versions of test()
  ob.test();
  ob.test(10);
  ob.test(10, 20);
  result = ob.test(123.25);
  System.out.println("Result of ob.test(123.25): " + result);
 }
}
// As you can see, test( ) is overloaded four times. The first version takes no parameters, the second takes one integer parameter, the third takes two integer parameters, and the fourth takes one double parameter. The fact that the fourth version of test( ) also returns a value is of no consequence relative to overloading, since return types do not play a role in overload resolution.
