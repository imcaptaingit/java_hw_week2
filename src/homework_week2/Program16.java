package homework_week2;

/** Write a Java program to add two binary numbers. Input Data:
 *  Input first binary number: 10 Input second binary number: 11
 *  Expected Output: Sum of two binary numbers: 101
 *
 */
public class Program16 {

    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];


        binary1 = 10;
        binary2 = 11;

        while (binary1 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 11 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 11;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}