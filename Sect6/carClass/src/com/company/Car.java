package com.company;

import java.util.Locale;

public class Car {
    // private hides the data, so other java classes cannot access it
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {

        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("holden")) {
            // this. accesses the class's properties
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }


    }
    // accesses the model value and returns it = provides access to the variable
    public String getModel() {
        return this.model;
    }
}
