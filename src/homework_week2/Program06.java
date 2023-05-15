package homework_week2;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Program06 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :-");

       double r = sc.nextDouble();
       double area = Math.PI *(r*r);

        System.out.println("Area of the circle is : " + area);
    }
}