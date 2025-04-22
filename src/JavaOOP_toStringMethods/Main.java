package JavaOOP_toStringMethods;

public class Main {
    public static void main(String[] args) {

        // .toString() = A method that is inherited from an Object class
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide a meaningful details.

        Car car1 = new Car("Ford","Mustang",2025,"Red");
        Car car2 = new Car("Chevrolet","Corvette",2026,"Blue");

        System.out.println(car1);
        System.out.println(car2);


    }
}
