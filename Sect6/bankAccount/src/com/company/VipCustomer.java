package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer() {
        this.name = "default name";
        this.creditLimit = 10000;
        this.email = "default email";
    }
    public VipCustomer(String name, String email) {
        this.creditLimit = 100000;
        this.name = name;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }




}
