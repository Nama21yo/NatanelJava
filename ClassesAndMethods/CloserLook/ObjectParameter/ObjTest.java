 class ObjTest {
  public static void main(String[] args) {
    ObjParam ob1 = new ObjParam(100, 22);
    ObjParam ob2 = new ObjParam(100, 22);
    ObjParam ob3 = new ObjParam(-1, -1);
    System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
    System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
  }
}
