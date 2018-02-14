package com.lesson;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //create scanner object
        Scanner input = new Scanner(System.in);

        // output the prompt
        System.out.println("Enter a Integer: ");
        //wait for the user to enter a line of text
        int value = input.nextInt();
        // Tell them what they entered
        System.out.println("You Entered: " + value);
    }
}
