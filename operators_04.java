// Demonstrate the boolean logical operators.
class BoolLogic {
 public static void main(String[] args) {
 boolean a = true;
 boolean b = false;
 boolean c = a | b;
 boolean d = a & b;
 boolean e = a ^ b;
 boolean f = (!a & b) | (a & !b);
 boolean g = !a;
 System.out.println(" a = " + a);//true
 System.out.println(" b = " + b);//false
 System.out.println(" a|b = " + c);//true
 System.out.println(" a&b = " + d);//false
 System.out.println(" a^b = " + e);//true
 System.out.println("!a&b|a&!b = " + f);//true
 System.out.println(" !a = " + g);//false
 }
}

// Demonstrate ?. with absolute value
class Ternary {
 public static void main(String[] args) {
 int i, k;
 i = 10;
 k = i < 0 ? -i : i; // get absolute value of i
 System.out.print("Absolute value of ");
 System.out.println(i + " is " + k);
 i = -10;
 k = i < 0 ? -i : i; // get absolute value of i
 System.out.print("Absolute value of ");
 System.out.println(i + " is " + k);
 }
}

// Demonstrate the bitwise logical operators.
class BitLogic {
 public static void main(String[] args) {
    String[] binary = {
    "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
    "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
    };
    int a = 3; // 0 + 2 + 1 or 0011 in binary
    int b = 6; // 4 + 2 + 0 or 0110 in binary
    int c = a | b;
    int d = a & b;
    int e = a ^ b;
    int f = (~a & b)|(a & ~b);
    int g = ~a & 0x0f;//0x0f= 0000 1111=15
    System.out.println(" a = " + binary[a]);//0011
    System.out.println(" b = " + binary[b]);//0110
    System.out.println(" a|b = " + binary[c]);//0111
    System.out.println(" a&b = " + binary[d]);//0010
    System.out.println(" a^b = " + binary[e]);//0101
    System.out.println("~a&b|a&~b = " + binary[f]);//0101
    System.out.println(" ~a = " + binary[g]);//1100
 }
}

// Left shifting a byte value.
class ByteShift {
 public static void main(String[] args) {
 byte a = 64, b;
 int i;
 i = a << 2;
 b = (byte) (a << 2);
 System.out.println("Original value of a: " + a);
 System.out.println("i and b: " + i + " " + b);
 }
}


class OpBitEquals {
 public static void main(String[] args) {
 int a = 1;
 int b = 2;
 int c = 3;
 a |= 4;
 b >>= 1;
 c <<= 1;
 a ^= c;
 System.out.println("a = " + a);//3
 System.out.println("b = " + b);//1
 System.out.println("c = " + c);//6
 }
}