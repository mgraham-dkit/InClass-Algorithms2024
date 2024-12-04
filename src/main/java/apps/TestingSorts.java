package apps;

import utils.ArrayManipulation;

public class TestingSorts {
    public static void main(String[] args) {
        int [] numbers = null;

        try {
            // Check behaviour with null array
            testSort(numbers, "Null array");
        }catch(IllegalArgumentException e){
            System.out.println("Exception occurred when trying to sort a null array");
        }

        // Check behaviour with empty array
        numbers = new int[]{0};
        testSort(numbers, "Empty array");

        // Check behaviour with array containing 1 slot
        numbers = new int[]{1};
        testSort(numbers, "Array with one slot");

        // Check behaviour with multiple elements
        numbers = new int[]{1, 45, 1, 2, 5, -1, 89, 11};
        testSort(numbers, "Array with multiple slots");

        // Check behaviour with sorted array
        numbers = new int[]{1, 1, 5, 6, 7, 8, 10, 90};
        testSort(numbers, "Array with multiple sorts in sorted order");
    }

    public static void testSort(int [] nums, String description){
        System.out.print(description + " before sorting: ");
        display(nums);
        ArrayManipulation.sort(nums);
        System.out.print(description + " after sorting: ");
        display(nums);
        System.out.println("---------------------------------");
    }

    public static void display(int [] nums){
        if(nums == null){
            throw new IllegalArgumentException("Cannot display contents from a null array");
        }

        if(nums.length == 0){
            System.out.println("Array is empty.");
        }

        System.out.print("[");
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length-1] + "]");
    }
}
