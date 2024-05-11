class Box {
  double width;
  double height;
  double depth;
//!!   One of the most common uses of object parameters involves constructors. Frequently,  you will want to construct a new object so that it is initially the same as some existing object. To do this, you must define a constructor that takes an object of its class as a parameter. 
// For example, the following version of Box allows one object to initialize another:
  Box(Box ob) {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }
  // constructor used when all dimensions specified
 Box(double w, double h, double d) {
 width = w;
 height = h;
 depth = d;
 }
 // constructor used when no dimensions specified
 Box() {
 width = -1; // use -1 to indicate
 height = -1; // an uninitialized
 depth = -1; // box
 }
 // constructor used when cube is created
 Box(double len) {
 width = height = depth = len;
 }
 // compute and return volume
 double volume() {
 return width * height * depth;
 }
}
