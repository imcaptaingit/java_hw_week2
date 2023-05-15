package homework_week2;
// 9. Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        char chUpper, chLower;
        int ascii;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Character in Uppercase: ");
        chUpper = scan.next().charAt(0);

        ascii = chUpper;
        ascii = ascii + 32;
        chLower = (char) ascii;

        System.out.println("\nEquivalent Character in Lowercase = " + chLower);
    }
}