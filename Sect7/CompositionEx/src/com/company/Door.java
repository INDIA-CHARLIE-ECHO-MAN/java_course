package com.company;

public class Door extends Platform{
    public Door(boolean isCat) {
        super(isCat);
        this.setObject("Door");
    }
    public void catExit() {
        if (isCat() == true) {
            System.out.println("Cat has exited.");
            setCat(false);
        }
        else {
            System.out.println("Cat cannot exit as it was not at door.");
        }
    }
}
