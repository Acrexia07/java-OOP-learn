package JavaOOP_Composition;

public class Main {
    public static void main(String[] args) {

        // Composition = Represents a "Part-of" relationship between objects.
        //               For example, an Engine is part of a Car.
        //               Allow complex objects to be constructed from smaller objects

        Car car1 = new Car("Corvette", 2025, "V8");

        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getEngine().type);
        car1.start();
    }
}
