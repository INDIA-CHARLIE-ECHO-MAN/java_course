package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    // test make account
    // test change details with account
    // test legit withdraw and deposit
    // test illegal withdraw and deposit

    @Test
    void makeAccount() {
        BankAccount account = new BankAccount();
        account.setAccountNumber(1000);
        account.setEmail("mark.hong@outlook.com.au");
        account.setCustomerName("Mark");
        account.setPhoneNumber(45151126);
        account.setBalance(1000);
    }
}