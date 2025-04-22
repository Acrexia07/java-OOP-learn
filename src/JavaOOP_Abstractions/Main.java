package JavaOOP_Abstractions;

public class Main {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        // Abstraction is the process of hiding the implementation details
        //             and showing only the essential features.

        // Abstract classes can't be instantiated directly
        // Can contain 'Abstract' methods (which must be implemented)
        // Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        circle.area();
        triangle.area();
        rectangle.area();
    }
}
