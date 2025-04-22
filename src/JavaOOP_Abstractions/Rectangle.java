package JavaOOP_Abstractions;

public class Rectangle extends Shape{

    double width;
    double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    double area(){
        return width * length;
    }
}
