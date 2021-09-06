package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // makes default account
    // this() command must be the first line called after calling default constructor
    public BankAccount() {
        this("default account number", 0, "default customer name", "default email", "default phone number");
        System.out.println("default constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double funds) {
        if (funds < 0) {
            System.out.println("Error, insufficient funds to deposit");
            return;
        }
        this.balance += funds;
    }

    public void withdrawFunds(double funds) {
        if (getBalance() < funds || funds < 0) {
            System.out.println("Error, insufficient funds to withdraw. Current balance is: " + getBalance());
            return;
        }
        this.balance -= funds;
    }
}
