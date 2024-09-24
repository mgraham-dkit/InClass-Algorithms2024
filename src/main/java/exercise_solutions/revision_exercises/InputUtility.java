package exercise_solutions.revision_exercises;

import java.util.Scanner;

public class InputUtility {
    // Create a reusable method to take in a number that can display different text each time.

    /**
     * Repeatedly reads in a value from the user until a number is entered.
     * @param prompt The information text to be displayed to the user.
     * @return The first valid number entered by the user.
     */
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

    /**
     * @param prompt
     * @param lower
     * @param upper
     * @return
     */
    // Create a reusable method to take in a number within a specified range
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
}
