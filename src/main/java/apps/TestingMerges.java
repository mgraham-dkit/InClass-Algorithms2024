package apps;

import static utils.ArrayManipulation.merge;

public class TestingMerges {
    public static void main(String[] args) {
        int [] nums1 = {10, 7, 9, 11, 8};
        int [] nums2 = {6, 12, -1, 84, 7, 12, 4};

        merge(nums1, nums2);
    }
}
