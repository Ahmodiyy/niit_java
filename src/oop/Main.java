package oop;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        System.out.println(square.calculateArea());
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        System.out.println(rectangle.calculateArea());
    }
}
