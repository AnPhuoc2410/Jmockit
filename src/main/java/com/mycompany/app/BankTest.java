package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
    @Test
    public void testProcessAccount() {
        Bank bank = new Bank();
        String result = bank.processAccount(10);
        assertEquals("Account holder Name for A/C id 10 is ‘Abhi’ ", result);
    }

    @Test
    public void testProcessAccountWithDifferentId() {
        Bank bank = new Bank();
        String result = bank.processAccount(20);
        assertEquals("Account holder Name for A/C id 20 is ‘Abhi’ ", result);
    }

    @Test
    public void testProcessAccountWithNegativeId() {
        Bank bank = new Bank();
        String result = bank.processAccount(-1);
        assertEquals("Account holder Name for A/C id -1 is ‘Abhi’ ", result);
    }

    @Test
    public void testProcessAccountWithZeroId() {
        Bank bank = new Bank();
        String result = bank.processAccount(0);
        assertEquals("Account holder Name for A/C id 0 is ‘Abhi’ ", result);
    }

    @Test
    public void testProcessAccountWithNonExistentId() {
        Bank bank = new Bank();
        String result = bank.processAccount(999);
        assertEquals("Account holder Name for A/C id 999 is ‘Abhi’ ", result);
    }

}