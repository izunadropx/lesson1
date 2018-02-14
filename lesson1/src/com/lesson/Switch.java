package com.lesson;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine(); // sets String variable called text for user input

        switch (text) { // enabled a switch for different output based on user input from the above String text
            case "start": // if start is typed the below will execute
                System.out.println("Machine Started!");
                break;
            case "stop": // if stop is typed the below will execute
                System.out.println("Machine Stopped!");
                break;

            default: // MUST ALWAYS have a default THIS ALWAYS GOES AT THE END OF THE SWITCH
                System.out.println("Command not recognised");
        }
    }
}
