package JavaOOP_PolyMorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = POLY means "MANY"
        //                MORPH means "SHAPE"
        // Polymorphism are objects than can be identified as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
