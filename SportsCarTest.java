/*
Question 7:
Create a class “Vehicle” with a method “start()”.
Create a subclass “Car” that adds a method “drive()”.
Create a subclass “SportsCar” that overrides the “drive()” method.
*/

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car driving");
    }
}

class SportsCar extends Car {
    void drive() {
        System.out.println("Sports car driving fast");
    }
}

public class SportsCarTest {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.start();
        c.drive();

        SportsCar s = new SportsCar();
        s.start();
        s.drive();
    }
}