package com.lesson;

public class Arrays {

    public static void main(String[] args) {

        int value = 7; // this is a variable

        int[] values; // this is a reference to a variable
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10; // assigning an int to values[0]
        values[1] = 20; // assigning an int to values[1]
        values[2] = 30; // assigning an int to values[2]

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for (int i = 0; i < values.length; i++)  // this will loop through until it gets to 1 less than the value of values
        {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7}; // this is another way of creating an array of values

        for (int i = 0; i < numbers.length; i++) // i is a loop variable which is only used within the scope of the for loop
        {
            System.out.println(numbers[i]); // this is iterating through each variable within the numbers array until i = < length of numbers array
        }

//////////////////PART 2 - STRINGS ///////////////////////////////////////////////////////////////

        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";


        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "Pear", "Kiwi"};

        for (String fruit : fruits) { // This is iterating through each value of fruits until it reaches the end
            System.out.println(fruit);
        }

        int number = 1; // this is an int - so it can allocate the memory for the value

        String text = null; // this is assigning a default value to a string for when nothing is passed or decalred

        System.out.println(text);

        String[] texts = new String[2]; // this is creating a reference to an array (Not the array or allocation of memory itself

        System.out.println(texts[0]);

        texts[0] = "one"; // this is declaring a variable to the 1st position of the array texts
    }
}