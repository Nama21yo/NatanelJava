package ClassesAndMethods.CloserLook.ArgumentPassing.PassbyReference;

 class RefTest {
    int a,b;

    RefTest(int i, int j) {
        a = i;
        b = j; 
    }
    //pass an object
    void meth(RefTest o) {
      o.a *= 2;
      o.b /= 2;
    }
}
