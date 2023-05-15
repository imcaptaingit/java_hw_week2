package homework_week2;
// 19. Write a Java program to convert a given string into lowercase.

import java.util.*;


public class Program19 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String in UPPERCASE: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}