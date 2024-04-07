public class Obolong {
  private double length;
  private double height;
  Obolong(double length,double height){//Constructor Method
    this.length = length;
    this.height = height;
    //Using getters and setters in Constructors
    this.setLength(length);
    this.setHeight(height);
  }
  //? Setters
  public void setLength(double length){
    if(length > 0){
      this.length = length;
    }else {//not Concise way to write it
      this.length = Integer.MIN_VALUE;
    }
  }
  public void setHeight(double height){
    if(height > 0){
      this.height = height;//!!!It shouldn't be STATIC
    }
    else{
      this.height = Integer.MIN_VALUE;
    }
  }
  //? Getter
  public double getLength(){
    return this.length;
  }
  public double getHeight(){
    return this.height;
  }
  //?Methods
  double calculateArea(){
    return length*height;
  }
  double calculatePerimeter(){
    return (2*length)+(2*height);
  }
}
