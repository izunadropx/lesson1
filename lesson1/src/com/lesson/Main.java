package com.lesson;


public class Main {

    public static void main(String[] args) {

        int value = 0;

        while (value < 10)
        {
            // while value is less than 10 - run - once it goes above 10 it will stop
            System.out.println("hello " + value);// whatever is in these curly braces is part of the while loop
            value = value + 1; // increments value by 1 each time the loop is run
        }
    }
}

