package exercise_solutions.revision_exercises;

import java.util.Scanner;

public class CalcMax {
    public static int findMax(int a, int b, int c){
        // If a is the biggest, return it
        if(a >= b && a >= c){
            return a;
        } // if b is bigger than c, b is biggest
        else if(b >= c){
            return b;
        }
        // c must be biggest
        return c;
    }

    public static int findMax(int [] values){
        // If there's nothing in the array, trigger an error
        // (this approach [throwing an exception] wouldn't be expected in your work yet!)
        if(values.length == 0){
            throw new IllegalArgumentException("Empty array provided");
        }

        // Get the first element and set it as the largest
        int max = values[0];
        // Loop through each value and check if that one is bigger
        for (int value : values) {
            // If it is, save that as the new max value
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    // Create a reusable method that can display different text each time.
    public static int getValidInteger(String prompt){
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        int num = 0;

        while(!valid){
            System.out.println(prompt);
            // Check if entered value is numeric. If it is, store it and change boolean flag to end loop
            if(input.hasNextInt()){
                num = input.nextInt();
                valid = true;
            }else{
                // Notify use about issue and clear the scanner content, so they can enter a new value.
                System.out.println("Integer is required. Please try again.");
                input.nextLine();
            }
        }

        return num;
    }

    // Create a reusable method that can display different text each time.
    public static int getValidInteger(String prompt, int lower, int upper){
        // If the upper boundary value is less than the lower boundary, end the method
        // (this approach [throwing an exception] wouldn't be expected in your work yet!)
        if(lower > upper){
            throw new IllegalArgumentException("Lower bound must be less than upper bound.");
        }

        boolean valid = false;
        int num = 0;

        while(!valid){
            // Use standard getValidInteger to get an int from the command line
            // (Don't bother rewriting this logic!!)
            num = getValidInteger(prompt);
            // Check if that int is within the allowable range
            // - if yes then end the loop, otherwise keep going
            if(num >= lower && num <= upper) {
                valid = true;
            }else{
                System.out.println("Value must be between " + lower + " and " + upper);
            }
        }

        return num;
    }

    public static void main(String[] args) {
        /*
        Write a program that:
        • Takes in 3 numbers from the user
            o You should use your getValidInteger method to validate each of the numbers as they are entered
        • Displays the highest of the entered numbers.
            o You should use your findMax() method to decide which number should be displayed.
         */

        // Take in values
        int a = getValidInteger("Please enter the first number: ");
        int b = getValidInteger("Please enter the second number: ");
        int c = getValidInteger("Please enter the third number: ");

        // Get largest and display
        int largest = findMax(a, b, c);
        System.out.println("The largest value entered was: " + largest);
    }
}
