package utils;

import business.Person;

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

    public static int[] mergeUsingSecondCounter(int [] nums1, int [] nums2){
        int [] merged = new int[nums1.length + nums2.length];
        int mergedPos = 0;

        for (int i = 0; i < nums1.length; i++) {
            merged[mergedPos] = nums1[i];
            mergedPos++;
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[mergedPos] = nums2[i];
            mergedPos++;
        }

        return merged;
    }

    public static int[] sortedMerge(int [] nums1, int [] nums2){
        int [] merged = new int[nums1.length + nums2.length];

        int nums1Pos = 0;
        int nums2Pos = 0;

        for (int i = 0; i < merged.length; i++) {
            if(nums1.length == nums1Pos){
                merged[i] = nums2[nums2Pos];
                nums2Pos++;
            }else if(nums2.length == nums2Pos){
                merged[i] = nums1[nums1Pos];
                nums1Pos++;
            }else{
                if (nums1[nums1Pos] <= nums2[nums2Pos]) {
                    merged[i] = nums1[nums1Pos];
                    nums1Pos++;
                } else {
                    merged[i] = nums2[nums2Pos];
                    nums2Pos++;
                }
            }
        }
        return merged;
    }

    public static int[] partitionAsc(int [] data, int pivot){
        // Validation
        if(data == null){
            return null;
        }

        int [] partitioned = new int[data.length];

        if(data.length <= 1){
            for (int i = 0; i < data.length; i++) {
                partitioned[i] = data[i];
            }
            return partitioned;
        }

        // Setup
        int [] left = new int[data.length];
        int [] right = new int[data.length];
        int leftTrack = 0;
        int rightTrack = 0;

        // Logic A
        // Filtering/Partitioning
        for (int value : data) {
            if(value <= pivot){
                left[leftTrack++] = value;
            }else{
                right[rightTrack] = value;
                rightTrack++;
            }
        }

        // Logic B
        // Merging
        int[] merged = getMerged(leftTrack, rightTrack, left, right);

        return merged;
    }

    public static int[] getMerged(int leftTrack, int rightTrack, int[] left, int[] right) {
        int [] merged = new int[leftTrack + rightTrack];
        int mergedPos = 0;

        for (int i = 0; i < leftTrack; i++) {
            merged[mergedPos] = left[i];
            mergedPos++;
        }

        for (int i = 0; i < rightTrack; i++) {
            merged[mergedPos] = right[i];
            mergedPos++;
        }
        return merged;
    }

    public static int shiftDelete(int [] nums, int pos){
        validateArray(nums);
        validatePosition(nums, pos);

        int deleted = nums[pos];

        for (int i = pos; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }

        nums[nums.length-1] = 0;
        return deleted;
    }

    public static int[] deduplicate(int [] nums){
        validateArray(nums);

        if(nums.length == 0){
            return nums;
        }

        int [] filtered = new int [nums.length];
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if(!contains(filtered, nums[i], count)){
                filtered[count] = nums[i];
                count++;
            }
        }

        if(count == nums.length){
            return filtered;
        }

        return shrink(filtered, count);
    }

    public static boolean contains(int [] nums, int value, int count){
        validateArray(nums);
        validateCount(nums, count);

        for (int i = 0; i < count; i++) {
            if(value == nums[i]){
                return true;
            }
        }
        return false;
    }

    private static void validateCount(int[] nums, int count) {
        if(count < 0 || count > nums.length){
            throw new IndexOutOfBoundsException("Number of positions to be checked cannot exceed the length of the " +
                    "array");
        }
    }

    public static int[] shrink(int [] nums, int count){
        validateArray(nums);
        validateCount(nums, count);

        int [] resized = new int[count];
        for (int i = 0; i < count; i++) {
            resized[i] = nums[i];
        }
        return resized;
    }

    private static void validatePosition(int[] nums, int pos) {
        if(pos < 0 || pos >= nums.length){
            throw new IndexOutOfBoundsException("Position cannot be outside boundary of array");
        }
    }

    private static void validateArray(int[] nums) {
        if(nums == null){
            throw new IllegalArgumentException("Array cannot be null");
        }
    }

    public static Person shiftDelete(Person[] people, int pos){
        validateArray(people);
        validatePosition(people, pos);

        Person deleted = people[pos];

        for (int i = pos; i < people.length - 1; i++) {
            people[i] = people[i+1];
        }

        people[people.length-1] = null;
        return deleted;
    }

    public static Person overwrite(Person [] people, Person value, int pos){
        validateArray(people);
        validatePerson(value);
        validatePosition(people, pos);

        Person original = people[pos];

        people[pos] = value;
        return original;
    }

    private static void validatePosition(Person[] people, int pos) {
        if(pos < 0 || pos >= people.length){
            throw new IndexOutOfBoundsException("Position cannot be outside boundary of array");
        }
    }

    private static void validatePerson(Person value) {
        if(value == null){
            throw new IllegalArgumentException("Person to be added cannot be null");
        }
    }

    private static void validateArray(Person[] people) {
        if(people == null){
            throw new IllegalArgumentException("Array cannot be null");
        }
    }

    public static int search(int [] nums, int value){
        // VALIDATION:
        if(nums == null){
            throw new IllegalArgumentException("Array to be searched cannot be null");
        }

        // SETUP:
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == value){
                return mid;
            }else if(value > nums[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }

        }
        return -1;
    }

    public static void sort(int [] data){
        if(data == null){
            throw new IllegalArgumentException("Array to be sorted cannot be null");
        }

        if(data.length <= 1){
            return;
        }

        for (int eleCount = 0; eleCount < data.length; eleCount++) {
            for (int i = 0; i < data.length - 1 - eleCount; i++) {
                if(data[i] > data[i+1]){
                    swap(data, i);
                }
            }
        }
    }

    private static void swap(int[] data, int i) {
        int temp = data[i];
        data[i] = data[i +1];
        data[i +1] = temp;
    }

    public static void optimisedSort(int [] data){
        if(data == null){
            throw new IllegalArgumentException("Array to be sorted cannot be null");
        }

        if(data.length <= 1){
            return;
        }

        boolean swapped = true;
        int count = 0;
        while(swapped){
            swapped = false;
            for (int i = 0; i < data.length - 1 - count; i++) {
                if(data[i] > data[i+1]){
                    swap(data, i);
                    swapped = true;
                }
            }
            count++;
        }
    }
}
