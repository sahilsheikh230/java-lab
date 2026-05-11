/*
Question 3:
Create a class “Shape” with a method “getArea()” that returns the area of the shape.
Create a subclass “Rectangle” that extends “Shape” and adds fields “length”
and “width” and overrides the “getArea()” method to return the area of the rectangle.
Create an object of the “Shape” class and call the “getArea()” method.
Create an object of the “Rectangle” class and call the “getArea()” method.
*/

class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    double getArea() {
        return length * width;
    }
}

public class ShapeRectangleTest {
    public static void main(String[] args) {

        Shape s = new Shape();
        System.out.println("Area of Shape: " + s.getArea());

        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}