package oop;

public class Square extends Shape{
    double length;
    Square(double length){
        this.length = length;
    }
    public double calculateArea(){
        return Math.pow(length, 2.0);
    }

}
