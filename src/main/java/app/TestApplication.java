package app;
import utils.ArrayManipulation;

public class TestApplication {
    public static void main(String[] args) {
        int [] data = {12, 25, 326, 213, 7, 23, 12, 8, -1, 24};

        ArrayManipulation.multiplyByTwo(data);
        System.out.println(data);
    }
}
