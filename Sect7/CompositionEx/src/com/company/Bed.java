package com.company;

public class Bed extends Platform{

    public Bed(boolean isCat) {
        super(isCat);
        this.setObject("Bed");
    }

    public void catSleep() {
        if (isCat() == true) {
            System.out.println("Cat begins sleeping on Bed");
        }
        else {
            System.out.println("Cat is not on Bed, cannot sleep on Bed");
        }
    }


}
