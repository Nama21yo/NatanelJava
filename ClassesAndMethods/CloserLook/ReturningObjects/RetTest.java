package ClassesAndMethods.CloserLook.ReturningObjects;

public class RetTest {
  int a;
  RetTest(int i) {
    a = i;
  }

  RetTest incrByTen() {
    RetTest temp = new RetTest(a+10);
    return temp;
  }
}
