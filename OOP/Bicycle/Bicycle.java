package OOP.Bicycle;

public class Bicycle {
   // the Bicycle class has
    // three fields
  int cadence = 0;
  int speed = 0;
  int gear  = 1;
  // the Bicycle class has
  // We can have two constructors
  public Bicycle(int startCadence,int startSpeed,int startGear){
    cadence=startCadence;
    speed=startSpeed;
    gear=startGear;
  }
  public Bicycle(){
    cadence=10;
    speed=0;
    gear=1;
  }
   // the Bicycle class has
    // four methods
  public void changeCadence(int newValue){
    cadence = newValue;
  }
  public void changeGear(int newValue){
    gear = newValue;
  }
  public void speedUp(int increment){
    speed += increment;
  }
  public void applyBrakes(int decrement){
    speed -= decrement;
  }
  public void printStates() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'printStates'");
  }
  
}
