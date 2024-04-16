package OOP.Bicycle;

public class MountainBike extends Bicycle{
  // the MountainBike subclass has
    // one field
  public int seatHeight;
  // the MountainBike subclass has
    // one constructor
  public MountainBike(int startHeight,int startGear,int startSpeed,int startCadence){
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
  }
  // the MountainBike subclass has
  // one method
  public void setHeight(int newValue) {
    seatHeight = newValue;
  }
}
