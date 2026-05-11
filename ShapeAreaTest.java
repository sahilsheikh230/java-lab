/*
Question 10:
Create a class “Shape” with a method “calculateArea()”.
Create two subclasses “Rectangle” and “Triangle”
that implement the “calculateArea()” method.
*/

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base = 8;
    double height = 4;

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        System.out.println("Rectangle Area: " + r.calculateArea());

        Triangle t = new Triangle();
        System.out.println("Triangle Area: " + t.calculateArea());
    }
}