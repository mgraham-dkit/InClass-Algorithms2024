package exercise_solutions.revision_exercises;

import java.util.Scanner;

public class Exercise1_2 {
    public static void main(String[] args) {
        int width = getValidNumber("Please enter the number of asterisks per row: ");
        int height = getValidNumber("Please enter the number of rows of asterisks: ");

        // Outer for loop controls how many rows are printed
        for (int i = 0; i < height; i++) {
            // Inner for loop controls how many *s are printed per row
            for (int j = 0; j < width; j++) {
                // Use print() instead of println() to keep all asterisks in a row on same line
                System.out.print("*");
            }
            // Final print moves to the next line
            System.out.println();
        }
    }

    // Create a reusable method that can display different text each time.
    public static int getValidNumber(String prompt){
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
}
