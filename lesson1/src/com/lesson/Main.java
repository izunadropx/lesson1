package com.lesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value = 0;

        while (value < 10) {
            // while value is less than 10 - run - once it goes above 10 it will stop
            System.out.println("hello " + value);// whatever is in these curly braces is part of the while loop
            value = value + 1; // increments value by 1 each time the loop is run
        }

//        Bank_account lewisaccount = new Bank_account();
//        System.out.println(lewisaccount.getCustName());
//        lewisaccount.withdraw(300);
//        lewisaccount.deposit(200);
//        lewisaccount.withdraw(100);
//        lewisaccount.setCustName();
//
//
//        Bank_account lewisaccount1 = new Bank_account();
//        System.out.println(lewisaccount1.getCustName());
//        lewisaccount.withdraw(300);
//        lewisaccount.deposit(200);
//        lewisaccount.withdraw(100);
//        lewisaccount.setCustName();
//
//        VIPCust paul = new VIPCust(); // this will call our empty constructor with the default values assigned
//        System.out.println(paul.getName());
//
//        VIPCust lewisVip = new VIPCust("Lewis", "hahaha"); // this will call constructor 2 with only 1 default value assigned
//        System.out.println(lewisVip.getName());
//        System.out.println(lewisVip.getCreditLimit());
//
//        VIPCust lewis = new VIPCust("lewis1",  150000000,"lewis1@lewis.com"); // this will call our complete constructor - assigning all values here
//        System.out.println(lewis.getName());
//        System.out.println(lewis.getCreditLimit());


        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();


    }
}



