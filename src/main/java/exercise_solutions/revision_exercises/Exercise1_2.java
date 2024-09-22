package exercise_solutions.revision_exercises;

public class Exercise1_2 {
    public static void main(String[] args) {
        int width = InputUtility.getValidInteger("Please enter the number of asterisks per row: ");
        int height = InputUtility.getValidInteger("Please enter the number of rows of asterisks: ");

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
}
