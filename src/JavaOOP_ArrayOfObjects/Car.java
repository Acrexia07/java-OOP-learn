package JavaOOP_ArrayOfObjects;

public class Car {

    String model;
    String color;

    // Constructor
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    // Method: Drive
    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
