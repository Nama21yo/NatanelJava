
class ObjParam {
  int a,b;
  ObjParam(int i, int j) {
    a = i;
    b = j;
  }
  // return true if o is equal to the invoking object
  boolean equalTo(ObjParam o) {
    if(o.a == a && o.b == b) return true;
    return false;
  }
}
