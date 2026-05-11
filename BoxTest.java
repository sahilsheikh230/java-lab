/*
Question 8:
Create a class “Shape” with a method “getArea()”.
Create a subclass “Rectangle”.
Create a subclass “Box”.
*/

class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 5;
    double width = 4;

    double getArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    double height = 3;

    double getArea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }
}

public class BoxTest {
    public static void main(String[] args) {

        Shape s = new Shape();
        System.out.println(s.getArea());

        Rectangle r = new Rectangle();
        System.out.println(r.getArea());

        Box b = new Box();
        System.out.println(b.getArea());
    }
}