package JavaOOP_Composition;

public class Engine {

    String type;

    // Constructor
    Engine (String type) {
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " Engine!");
    }
}
