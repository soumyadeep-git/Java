//Understanding the concepts of OOPs
class Car {
    // Properties of the car
    String brand;
    int noOfCylinders;
    String fuelType;

    // A function inside a class is called a method
    public void running() {
        System.out.println("Your car is running");
    }

    // this keyword tells which object is calling
    public void getFueltype() {
        System.out.println("Your car runs on " + this.fuelType);
    }
}

public class Class_Objects {
    public static void main(String[] args) {
        // Creating object
        Car racecar = new Car();
        racecar.brand = "Kawasaki";
        racecar.noOfCylinders = 3;
        racecar.fuelType = "Electric";
        racecar.running();
        // Creating a different object
        Car roadster = new Car();
        roadster.brand = "BMW";
        roadster.noOfCylinders = 2;
        roadster.fuelType = "Petrol";
        roadster.getFueltype();
    }
}
// NOTE : new is a keyword used to create object
// Notice we use () on line 22 and 28 which we only use in functions
// Here () is used to create an object named Car in the heap memory....
// in other words Car() is a contructor