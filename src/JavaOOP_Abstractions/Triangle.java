package JavaOOP_Abstractions;

public class Triangle extends Shape{

    double base;
    double height;

    // Constructor
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}
