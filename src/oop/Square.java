package oop;

public class Square extends Shape{
    double length;
    Square(double length){
        this.length = length;
    }
    public double calculateArea(){
        return Math.pow(length, 2.0);
    }
    public void display(){
        System.out.println("This is a square");
    }
    public void test(){
        System.out.println("this is test");
    }
    public void test(String str){
        System.out.println("this is test");
    }

}
