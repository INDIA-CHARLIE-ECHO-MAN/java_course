package com.company;

public class Main {
    @Test
    void makeAccount() {
        BankAccount test = new BankAccount();

        // test make an account
        test.setAccountNumber(256324);
        test.setBalance(20000);
        test.setEmail("mark.hong@outlook.com.au");
        test.setPhoneNumber(96861119);
        test.setCustomerName("Mark");            
    }
        // test retrieving information from account
        // test changing details of account and check details have changed

        // test deposit and withdraw legit
        // test incorrect deposit and withdrawal


    public static void main(String[] args) {

    }
}
