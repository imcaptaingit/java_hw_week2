package homework_week2;

/**
 * Write a Java program that takes three numbers as input to calculate
 * and print the average of the numbers.
 */

import java.util.Scanner;
public class Program13 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = in.nextDouble();
        System.out.print("Enter the second number: ");
        double b = in.nextDouble();
        System.out.print("Enter the third number: ");
        double c = in.nextDouble();
        System.out.print("The average value is : " + average(a, b, c)+"\n" );
    }

    public static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}