package homework_week2;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;
public class Program05 {

    public static void main(String[] args) {

        Scanner lp = new Scanner(System.in);

        System.out.println("Welcome to the Calculator");

        System.out.print("Enter first number: ");
        int x = lp.nextInt();

        System.out.print("Enter second number: ");
        int y = lp.nextInt();


        System.out.println(x + " + " + y + " = " +
                (x + y));

        System.out.println(x + " - " + y + " = " +
                (x - y));

        System.out.println(x + " x " + y + " = " +
                (x * y));

        System.out.println(x + " / " + y + " = " +
                (x / y));

    }


}
