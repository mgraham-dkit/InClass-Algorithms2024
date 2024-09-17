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

    public static void printArray(int [] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println((i+1) + ") " + data[i]);
        }
    }

    public static int getPosition(int [] nums, int value){
        for (int i = 0; i < nums.length; i++) {
            if(value == nums[i]){
                return i;
            }
        }
        return -1;
    }

}
