package Lesson4;

import java.util.Scanner;
public class Task0 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 7, 8, 11, 14, 17, 20, 22, 24};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int Number = scanner.nextInt();
        for (int i : array) {
            if (i == Number) {
                System.out.println("This number in array ");
                break;
            }
            else {
                System.out.println("This number not in array");
                break;
            }
        }
    }
}