package com.lesson;

import java.util.Scanner;

public class Dowhile {

    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in); // create a new scanner object called scanner

       /*
        System.out.println("Enter a Number: ");
        int value = scanner.nextInt();

        while(value != 5){
            System.out.println("Enter a Number: ");
            value = scanner.nextInt();

        }
*/
        int value = 0; // This must be declared outside of the loop to work as it being used as the condition for loop
       do {
           System.out.println("Enter a Number: ");
           value = scanner.nextInt(); // variables declared within braces only exists in this set of braces
       }
       while(value != 5); // While value is not equal to 5 keep running
            System.out.println("Got 5!");

    }
}
