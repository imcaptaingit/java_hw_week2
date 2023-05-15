package homework_week2;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ..........
 * 8 x 10 = 80
 */



public class Program10 {

    public static void main(String[] args) {

        for (int i=0; i< 10; i++){
            System.out.println(8 + " x " + (i+1) + " = " +
                    (8 * (i+1)));
        }
    }
}
