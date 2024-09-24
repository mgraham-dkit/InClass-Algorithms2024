package utils;

import java.util.Arrays;

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

    /**
     * Gets the minimum value within the supplied array.
     * @param nums The array to be searched.
     * @return The minimum value found within the array.
     */
    public static int getMin(int [] nums){
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static int [] grow(int [] nums){
        int [] temp = new int[nums.length + 10];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        return temp;
    }

    public static String [] grow(String [] text){
        String [] temp = new String[text.length + 10];

        for (int i = 0; i < text.length; i++) {
            temp[i] = text[i];
        }

        return temp;
    }

    public static int[] merge(int [] nums1, int [] nums2){
        int [] merged = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[i+nums1.length] = nums2[i];
        }

        return merged;
    }
}
