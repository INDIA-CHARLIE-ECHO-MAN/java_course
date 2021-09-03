package com.company;

public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }
    public long getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(long funds) {
        if (funds < 0) {
            System.out.println("Error, insufficient funds to deposit");
            return;
        }
        this.balance = getBalance() + funds;
    }

    public void withdrawFunds(long funds) {
        if (funds < getBalance()) {
            System.out.println("Error, insufficient funds to withdraw. Current balance is: " + getBalance());
            return;
        }
        this.balance = getBalance() - funds;
    }
}
