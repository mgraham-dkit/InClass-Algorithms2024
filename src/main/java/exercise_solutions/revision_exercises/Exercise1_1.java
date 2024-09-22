package exercise_solutions.revision_exercises;

public class Exercise1_1 {
    public static void main(String[] args) {
        /*
            Write a program that:
            • Repeatedly takes in numbers from the user. Input should terminate when the user enters -1.
            • Once -1 has been entered, the program should print out the sum and average of the entered numbers
         */
        // Initialise variables to track running total, count of entered numbers and newest value entered
        int value = 0;
        int sum = 0;
        int count = 0;

        // Repeatedly take in number, check if it's -1 and if not, add to the running total and count
        // Use a do-while to ensure even first number is properly processed
        do{
            // Use custom method to take in number to avoid potential errors with non-numeric data entry
            value = InputUtility.getValidInteger("Please enter a number (-1 to end):");
            if(value != -1){
                sum = sum + value;
                count++;
            }
        }while(value != -1);

        // Print out results if there were any valid values entered
        // Otherwise print out info message.
        if(count > 0){
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (sum/count));
        }else{
            System.out.println("No values entered.");
        }
    }
}
