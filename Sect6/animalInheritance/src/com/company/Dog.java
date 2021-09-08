package com.company;

public class Dog extends Animal{

    private int eyes;
    private int teeth;
    private int tail;
    private int legs;
    private String coat;

    // dog constructor
    // doesn't need all parameter as it can be hardcoded into the super
    public Dog(int weight, int size, String name, int eyes, int teeth, int tail, int leg, String coat) {

        // calls constructor that is class that we extended from (Animal)
        // initialises animal class for the dog class
        super(1, 1, weight, size, name);

        // assign the unique parameters to dog class
        this.eyes = eyes;
        this.teeth = teeth;
        this.tail = tail;
        this.legs = legs;
        this.coat = coat;
    }

    // given that Animal methods are public, the dog class can call and use them

    // @Override = overriding a method that exists in the superclass -> Animal class
    // this means if the eat method was called for dog, it would prioritise calling the override eat method
    // in the dog class, rather than the eat method in the super class.
    // if @Override does not exist
    @Override
    public void eat() {
        System.out.println("Dog started eating");
        chew();

        // call eat from the super class -> eat method from Animal class
        super.eat();
    }

    // private methods only available for and from dog class
    private void chew() {
        System.out.println("Dog started chewing");
    }

    public void walk() {
        System.out.println("Dog started walking");
        move(1);
    }
    public void run() {
        System.out.println("Dog started running");
        move(10);
    }
}
