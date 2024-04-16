package OOP.Bicycle;

class TandemBike extends Bicycle{
  int seatHeight;
  int handler;
  public TandemBike(int startHeight,int startHandler,int startCadence,int startGear,int startSpeed){
    super(startCadence, startSpeed, startGear);
    seatHeight=startHeight;
    handler=startHandler;
  }
  void sethandler(int newValue){
    handler = newValue;
  }
  void setHeight(int newValue){
    seatHeight = newValue;
  }
}
