package com.company;

public class Main {

    public static void main(String[] args) {
        // initialise the car object using a constructor new Car()
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Porsche");
        System.out.println("Porsche has model " + porsche.getModel());
    }
}
