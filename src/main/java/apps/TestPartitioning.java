package apps;

import utils.ArrayManipulation;

import java.util.Arrays;

public class TestPartitioning {
    public static void main(String[] args) {
        int [] data = {900, 12, 4, 1, 56, 2, 77, 9, -1, 45};
        int pivot = 40;

        int [] partitioned = ArrayManipulation.partitionAsc(data, pivot);

        System.out.println("Original array: " + Arrays.toString(data));
        System.out.println("Partitioned array: " + Arrays.toString(partitioned));
    }
}
