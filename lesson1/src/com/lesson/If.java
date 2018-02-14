package com.lesson;

public class If {
    public static void main(String[] args) {
        int loop = 0;
        int myInt = 5;

        while (true) { //while condition is true - continue to loop
            if (myInt > 30) { // If(condition) {code}
                System.out.println("Yes, it's true");
            } else if (myInt > 10) { //if first cond isn't met it moves onto this
                System.out.println("No It's false");
            } else { // if neither of the above are met it will move onto this part
                System.out.println("None of the above");
            }
            if (loop == 5) { // if loop reaches a count of 5 it will break
                break;
            }
            loop++; // increments loop each time round
        }
    }
}
