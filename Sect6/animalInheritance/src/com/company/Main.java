package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(1, 1, 1, 5, "Animal");
        Dog dog = new Dog(20, 5, "Shepherd", 2, 30, 2, 5, "white");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
