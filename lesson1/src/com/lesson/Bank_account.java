package com.lesson;

import java.util.Scanner;


public class Bank_account {
    private String custName;
    private String custEmail;
    private int phoneNumber;
    private int accountNumber;
    private double accountBalance;

    public Bank_account(String custName, String custEmail, int phoneNumber) {
        this(custName, custEmail, phoneNumber, 212323, 2323.000); // this is when only 3 values are assigned when the class is called
        System.out.println("2nd constructor being called!");
    }

    public Bank_account() {
        this("Bob", "bob@bob.com", 123456743, 250, 25000.00);
        System.out.println("Empty Constructor called!"); // this is assigning default values when none are specified upon call in main
    }

    public Bank_account(String custName, String custEmail, int phoneNumber, int accountNumber, double accountBalance) {
        System.out.println("Calling full constructor constructor!"); // this has all values assigned when called in main
        this.accountBalance = accountBalance;
        this.custName = custName;
        this.accountNumber = accountNumber;
        this.custEmail = custEmail;
        this.phoneNumber = phoneNumber;
    }

    public void withdraw(int wAmount) {
        if (accountBalance - wAmount < 0) {
            System.out.println("You do not have enough funds!");

        } else {
            accountBalance -= wAmount;
            System.out.println("You withdrew " + wAmount + " from your account. You have " + this.accountBalance + " remaining!");
        }
    }

    public void deposit(int dAmount) {
        this.accountBalance += dAmount;
        System.out.println("You just deposited " + dAmount + ". Your balance is now " + this.accountBalance);
    }

    public String getCustName() {
        return custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setCustName() {
        this.custName = custName;
    }


    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


}



