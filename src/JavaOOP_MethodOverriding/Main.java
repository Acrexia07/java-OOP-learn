package JavaOOP_MethodOverriding;

public class Main {
    public static void main(String[] args) {

        // Method Overriding = When subclass provides its own output,
        //                     We implement the method that is already defined.
        //                     Allows for code reusability and give specific implementations.


        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();


    }
}
