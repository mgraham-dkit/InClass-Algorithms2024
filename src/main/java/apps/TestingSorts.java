package apps;

import utils.ArrayManipulation;

public class TestingSorts {
    public static void main(String[] args) {
        int [] numbers = {1, 45, 1, 2, 5, -1, 89, 11};

        ArrayManipulation.sort(numbers);

        display(numbers);
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
            System.out.print(nums[i] + " ");
        }
        System.out.println(nums[nums.length-1] + "]");
    }
}
