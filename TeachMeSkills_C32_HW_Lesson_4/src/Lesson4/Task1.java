package Lesson4;

import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 7, 8, 11, 14, 17, 20, 22, 24};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int Number = scanner.nextInt();
        int count = 0;
        for (int i : array ) {
            if (Number == i) {
                count ++;
            }
        }
        int[] newArray = new int[array.length - count];
        int newCount = 0;
        for (int i : array) {
            if (i != Number) {
                newArray[newCount] = i;
                newCount++;
            }
        }
        if (newArray.length != array.length) {
            System.out.println("Старый: " + Arrays.toString(array));
            System.out.println("Новый: " + Arrays.toString(newArray));
        }
        else {
            System.out.println("Массив остался без изменений");
        }

    }
}