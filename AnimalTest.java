/*
Question 6:
Create a class “Animal” with a method “makeSound()” that prints a sound.
Create a subclass “Mammal” that extends “Animal” and adds a method “giveBirth()”.
Create a subclass “Dog” that extends “Mammal” and overrides the “makeSound()”.
*/

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Giving birth");
    }
}

class Dog extends Mammal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        Mammal m = new Mammal();
        m.makeSound();
        m.giveBirth();

        Dog d = new Dog();
        d.makeSound();
        d.giveBirth();
    }
}