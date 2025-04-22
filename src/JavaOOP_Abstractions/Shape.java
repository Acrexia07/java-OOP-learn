package JavaOOP_Abstractions;

public abstract class Shape {

    abstract double area(); // Abstract method

    void display() {
        System.out.println("This is a shape."); // Concrete method - can be inherited
    }

}
