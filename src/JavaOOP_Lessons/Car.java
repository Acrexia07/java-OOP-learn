package JavaOOP_Lessons;

public class Car {

    // Initialization: Variable Declaration
    // Objects: Attributes
    String make = "Ford";
    String model = "Mustang";
    int year  = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    // Object: Methods
    void start(){
        isRunning = true;
        System.out.printf("You start the engine of %s!\n", model);
    }
    void stop(){
        isRunning = false;
        System.out.printf("You stop the engine of %s!\n", model);
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You break the " + model);
    }
}
