package com.lesson;

public class Arrays_cont {

    public static void main(String[] args) {

        int[] values = {3, 5, 2762}; // 1 dimensional array - Can only hold 1 set of data

        System.out.println(values[2]);

        int[][] grid = {
                {3, 5, 232},
                {54, 23, 32}, // This is a multi dimensional array - its an array containing an array
                {3, 5, 62}
        };

        System.out.println(grid[1][1]); // to access each part of the array specify position (similar to a table) This will print "23"
        System.out.println(grid[0][2]); //This will print "232"


        String[][] texts = new String[2][3]; // This is another way of making a multi dimensional array
                                             // 2 rows and 3 col are contained within
        texts[0][1] = "Hello There";

        System.out.println(texts[0][1]); //

        for (int row = 0; row < grid.length; row++) { // This is a nested loop which is needed to iterate through an array - This is using grid length as it is the outer most level of the array
            for (int col = 0; col < grid[row].length; col++) { // This is looping through the cols providing it is < row length after it stops
                System.out.print(grid[row][col] + "\t"); // here were using print rather than println and using  \t we can tab it out and make it look nice
                
            }
            System.out.println();
        }

    }

}


