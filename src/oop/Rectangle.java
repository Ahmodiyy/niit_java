package oop;

public class Rectangle extends Shape {
    double length, breath;

    Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }
    public double calculateArea(){
        return length * breath;
    }
}
