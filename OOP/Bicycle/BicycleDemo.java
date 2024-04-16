package OOP.Bicycle;

class BicycleDemo {
  public static void main(String[] args) {
    // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        // bike1.printStates();
        System.out.println(bike1);

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        // bike2.printStates();
  }
}
// cadence:50 speed:10 gear:2
// cadence:40 speed:20 gear:3
