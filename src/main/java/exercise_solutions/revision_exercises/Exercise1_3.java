package exercise_solutions.revision_exercises;

public class Exercise1_3 {
    public static void main(String[] args) {
        /*
            Write a program that:
            • Takes in two numbers from the user.
            • Adds up all the numbers between those the user entered.
            • Outputs the result.
            • Example: If a user enters 3 and 7, then the program should print out 25 (i.e. 3+4+5+6+7).
            Your program should still work correctly, even if the user enters the bigger number first (i.e. 7 and then 3).
         */
        // Take in numbers
        int num1 = InputUtility.getValidInteger("Please enter the first number: ");
        int num2 = InputUtility.getValidInteger("Please enter the second number: ");

        // Check if the values were entered in the right order
        // If the first number is the bigger one, swap the values around
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int total = 0;
        for(int i = num1; i <= num2; i++){
            total += i;
        }
        System.out.println("The total of all numbers from " + num1 + " to " + num2 + " is "+ total);
    }
}
