public class typeConversion_03 {

 public static void main(String[] args) {
  byte b = 127;
  int a = b;
  System.out.println(a);//It is converted(Automatic Casting) to integer and accepted

  int d = 257;
  byte c = (byte)d;
  System.out.println(c);//It is casted(Expilicitly) to byte and accepted

  float f = 5.6f;
  int e = (int)f;
  System.out.println(e);//It is casted to integer and output: 5

 }

}


class Promote {
 public static void main(String[] args) {
 byte b = 42;
 char c = 'a';
 short s = 1024;
 int i = 50000;
 float f = 5.67f;
 double d = .1234;
 double result = (f * b) + (i / c) - (d * s);
 System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
 System.out.println("result = " + result);
 }
}
