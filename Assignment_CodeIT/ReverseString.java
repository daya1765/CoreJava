/*
 *  A Java program that accepts a string from the user and prints the reverse of that string.
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        char[] str = sc.nextLine().toCharArray();
        System.out.print("Reversed string is: ");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }
        System.out.println();

    }
}
