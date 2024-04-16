package OOP.Bicycle;

 class ACMEBicycle implements Bicycle {
   int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.
  //  To actually compile the ACMEBicycle class, you'll need to add the public keyword to the beginning of the implemented interface methods. 

     void changeCadence(int newValue) {
         cadence = newValue;
    }

     void changeGear(int newValue) {
         gear = newValue;
    }

     void speedUp(int increment) {
         speed = speed + increment;   
    }

     void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

     void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
