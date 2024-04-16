package OOP.Bicycle;

class RoadBike extends Bicycle {
  int handler ;
  public RoadBike(int startHandler,int startCadence,int startGear,int startSpeed){
    super(startCadence, startSpeed, startGear);
    handler= startHandler;
  }
  void sethandler(int newvalue){
    handler = newvalue;
  }
  
}
