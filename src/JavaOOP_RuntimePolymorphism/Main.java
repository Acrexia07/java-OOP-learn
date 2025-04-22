package JavaOOP_RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner scn = new Scanner(System.in);


        Animal animal;

        System.out.print("Would you like dog or Cat? (1 = dog or 2 = cat):");
        int choice = scn.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }

        scn.close();
    }
}
