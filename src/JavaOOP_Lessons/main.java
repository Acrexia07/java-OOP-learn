package JavaOOP_Lessons;

import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);
        Random rnd = new Random();

        Car car = new Car();

        //Attributes: From Car public class
        System.out.println("Car attributes");
        System.out.println("Manufacturer: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Manufacture year: " + car.year);
        System.out.println("Price: " + car.price);


        //Methods: From Car public class
        System.out.printf("\nCurrent status of the Car: Running?: %s.\n\n", car.isRunning);
        car.start();
        car.drive();
        System.out.printf("Current status of the Car: Running?: %s.\n\n", car.isRunning);

        car.stop();
        car.brake();
        System.out.printf("Current status of the Car: Running?: %s.\n", car.isRunning);

    }
}
