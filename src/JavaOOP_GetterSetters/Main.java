package JavaOOP_GetterSetters;


public class Main {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them
        // GETTER = Methods that make a field READABLE
        // SETTER = Methods that make a field WRITABLE

        Car car = new Car ("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}
