package homework_week2;

/**
 * 18. Write a Java program to print the sum
 * (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data: Input first number: 125 Input second number: 24
 * Expected Output : 125 + 24 = 149 125 - 24 = 101 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5
 */

public class Program18 {

    public static void main(String[] args) {


        int num1 = 125;
        int num2 = 24;


        System.out.println("Addition of two numbers: " + num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println("subtraction of two numbers: " + num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println("Multiplication of two numbers: " + num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println("Division of two numbers: " + num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println("Remainder of two numbers: " + num1 + " mod " + num2 + " = " +
                (num1 % num2));
    }

}