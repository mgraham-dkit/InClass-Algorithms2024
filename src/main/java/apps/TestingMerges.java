package apps;

import java.util.Arrays;

import static utils.ArrayManipulation.*;

public class TestingMerges {
    public static void main(String[] args) {
        int [] nums1 = {10, 7, 9, 11, 8};
        int [] nums2 = {6, 12, -1, 84, 7, 12, 4};

        int [] merged = mergeUsingSecondCounter(nums1, nums2);

        System.out.println("Merged using second counter: " + Arrays.toString(merged));

        merged = merge(nums1, nums2);
        System.out.println("Merged using offset approach: " + Arrays.toString(merged));

        System.out.println("#####Sorted Merge#####");
        int [] sortedNums1 = {1, 2, 3, 4, 5, 22};
        int [] sortedNums2 = {2, 4, 6, 8, 10};
        merged = sortedMerge(sortedNums1, sortedNums2);
        System.out.println("Sorted merge: " + Arrays.toString(merged));
    }
}
