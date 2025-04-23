package JavaOOP_GetterSetters;

public class Car {

    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //Method: Readable variable
    String getModel(){
        return this.model;
    }

    //Method: Readable variable
    String getColor(){
        return this.color;
    }

    //Method: Readable variable
    String getPrice(){
        return "$" + this.price;
    }


    //Method: Writable variable
    void setColor(String color){
        this.color = color;
    }

    //Method: Writable variable
    void setPrice(int price){
        this.price = price;
    }
}
