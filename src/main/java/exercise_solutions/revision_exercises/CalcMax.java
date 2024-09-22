package exercise_solutions.revision_exercises;

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

        public static void main(String[] args) {
        /*
        Write a program that:
        • Takes in 3 numbers from the user
            o You should use your getValidInteger method to validate each of the numbers as they are entered
        • Displays the highest of the entered numbers.
            o You should use your findMax() method to decide which number should be displayed.
         */

        // Take in values
        int a = InputUtility.getValidInteger("Please enter the first number: ");
        int b = InputUtility.getValidInteger("Please enter the second number: ");
        int c = InputUtility.getValidInteger("Please enter the third number: ");

        // Get largest and display
        int largest = findMax(a, b, c);
        System.out.println("The largest value entered was: " + largest);
    }
}
