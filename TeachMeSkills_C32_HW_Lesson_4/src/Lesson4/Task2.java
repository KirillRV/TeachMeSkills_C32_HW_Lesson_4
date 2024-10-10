package Lesson4;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter array size ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i]= (int) (10*Math.random());
        }
        System.out.println("array: " + Arrays.toString(array));

        OptionalInt max = Arrays.stream(array).max();
        OptionalInt min = Arrays.stream(array).min();
        double average = Arrays.stream(array).average().orElse(0.0);

        System.out.println("max: " + max.getAsInt());
        System.out.println("min: " + min.getAsInt());
        System.out.println("average: " + average);
    }
}