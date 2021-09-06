package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void makeAccount() {
        BankAccount account = new BankAccount("1000", 1000, "Mark", "mark.hong@outlook.com.au", "0466408340");
        assertEquals(account.getAccountNumber(), "1000");
        assertEquals(account.getBalance(), 1000);
        assertEquals(account.getEmail(), "mark.hong@outlook.com.au");
        assertEquals(account.getCustomerName(), "Mark");
        assertEquals(account.getPhoneNumber(), "0466408340");
    }
    @Test
    void legitActions() {
        BankAccount account = new BankAccount("1000", 1000, "Mark", "mark.hong@outlook.com.au", "0466408340");
        account.withdrawFunds(900);
        assertEquals(100, account.getBalance());
        account.depositFunds(900);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void illegalActions() {
        BankAccount account = new BankAccount("1000", 1000, "Mark", "mark.hong@outlook.com.au", "0466408340");

        account.depositFunds(-1000);
        assertEquals(1000, account.getBalance());

        account.withdrawFunds(-1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testDefaultVip() {
        VipCustomer customer = new VipCustomer();
        assertEquals("default name", customer.getName());
        assertEquals("default email", customer.getEmail());
        assertEquals(10000, customer.getCreditLimit());
    }

    @Test
    void testDefaultCredit() {
        VipCustomer customer = new VipCustomer("rich guy", "richguy@email.com");
        assertEquals("rich guy", customer.getName());
        assertEquals(100000, customer.getCreditLimit());
        assertEquals("richguy@email.com", customer.getEmail());
    }

    @Test
    void testMakeVip() {
        VipCustomer customer = new VipCustomer("test", 1000,"test@gmail.com");
        assertEquals("test", customer.getName());
        assertEquals(1000, customer.getCreditLimit());
        assertEquals("test@gmail.com", customer.getEmail());
    }

}