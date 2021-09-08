package com.company;

public class Toyota extends Car {
    private int roadService;

    public Toyota(int wheels, int doors, int gears, boolean isManual, int roadService) {
        super("Toyota", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        }
        else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        }
        else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(4);
        }

    }
}
