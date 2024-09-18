package utils;

public class ArrayManipulation {
    /**
     * Multiply the contents of each slot in an array by 2
     * @param data The array to be edited
     */
    public static void multiplyByTwo(int [] data){
        /*
            for each value in the array:
                Set value to value *2
         */
        for(int i = 0; i < data.length; i++){
            data[i] = data[i] * 2;
        }
    }

    /**
     * Print the contents of the supplied array to the screen.
     * @param data The array to be displayed.
     */
    public static void printArray(int [] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println((i+1) + ") " + data[i]);
        }
    }

    /**
     * Get the (first) position of the supplied element within the supplied array.
     * @param nums The array to search.
     * @param value The value to search for.
     * @return The first position of the value within the array, or -1 if it was not found.
     */
    public static int getPosition(int [] nums, int value){
        for (int i = 0; i < nums.length; i++) {
            if(value == nums[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * Get the number of times the supplied value appears within the supplied array.
     * @param nums The array to be searched.
     * @param term The value to be counted.
     * @return The number of times the term appears within the array.
     */
    public static int getCount(int [] nums, int term){
        int count = 0;

        for (int num : nums) {
            if(num == term){
                count++;
            }
        }
        return count;
    }

    /**
     * Gets the maximum value within the supplied array.
     * @param nums The array to be searched.
     * @return The maximum value found within the array.
     */
    public static int getMax(int [] nums){
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if(num > max){
                max = num;
            }
        }
        return max;
    }

}
