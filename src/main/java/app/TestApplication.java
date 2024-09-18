package app;
import utils.ArrayManipulation;

import java.util.Arrays;

public class TestApplication {
    public static void main(String[] args) {
        int [] data = {12, 25, 326, 213, 7, 23, 12, 8, -1, 24};

        ArrayManipulation.multiplyByTwo(data);
        System.out.println(Arrays.toString(data));
        ArrayManipulation.printArray(data);

        System.out.println("24 found at position: " + ArrayManipulation.getPosition(data, 25));

        System.out.println("The largest value in our array is: " + ArrayManipulation.getMax(data));
    }
}
