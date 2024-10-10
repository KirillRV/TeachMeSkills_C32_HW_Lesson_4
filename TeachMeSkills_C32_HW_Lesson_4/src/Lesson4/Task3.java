package Lesson4;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 7, 8, 11};
        int[] array1 = new int[]{3, 7, 11, 20, 16};
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("array1: " + Arrays.toString(array1));
        double average = Arrays.stream(array).average().orElse(0.0);
        double average1 = Arrays.stream(array1).average().orElse(0.0);
        System.out.println("average: " + average);
        System.out.println("average: " + average1);
        if (average > average1) {
            System.out.println(" array average bigger than array1 average ");
        } else if (average < average1) {
            System.out.println(" array1 average bigger than array average ");
        } else {
            System.out.println("average are equal ");
        }
    }
}
