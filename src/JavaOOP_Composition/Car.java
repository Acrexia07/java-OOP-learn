package JavaOOP_Composition;

public class Car {

    public final String model;
    private final int year;
    private final Engine engine;

    // Constructor
    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); // Initialization: Composition

    }

    String getModel(){
        return this.model;
    }

    int getYear(){
        return this.year;
    }

    Engine getEngine(){
        return this.engine;
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is Running.");
    }
}
