package JavaOOP_ArrayOfObjects;

public class Main {
    public static void main(String[] args) {

        // Objects
//        Car car1 = new Car("Mustang", "Red");
//        Car car2 = new Car("Corvette", "Blue");
//        Car car3 = new Car("Charger", "Yellow");
//
//        Car[] cars = {car1, car2, car3};

//        for(int i = 0; i < cars.length; i++){
//            cars[i].drive();
//        }
//        for(Car car : cars){
//            car.drive();
//        }

        // Anonymous Objects
        Car[] cars = {new Car("Mustang", "Red"),
                      new Car("Corvette", "Blue"),
                      new Car("Charger", "Yellow")};

        for(Car car : cars){
            car.color = "Black";
        }

        for (Car car : cars) {
            car.drive();
        }

    }
}
