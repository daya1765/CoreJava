/*
 *  A Java program that takes an integer array as input and finds the maximum element in that array.
 */

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the integer array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array integers: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Maximum element is: " + max);

    }
}
