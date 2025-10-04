package Week4_Assignment;

abstract class Vehicle {
       abstract void start();
       abstract void stop();
}

  class Car extends Vehicle {

        @Override
        void start(){
            System.out.println("Car is starting");
         }

           @Override
           void stop(){
               System.out.println("Car has stopped");
           }
}


class Bike extends Vehicle {

    @Override
    void start(){
        System.out.println("Bike is starting");
    }

    @Override
    void stop(){
        System.out.println("Bike has stopped");
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();

        vehicle = new Bike();
        vehicle.start();
        vehicle.stop();
    }
}
