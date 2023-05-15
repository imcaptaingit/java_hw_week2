package homework_week2;

public class Program15 {
    public static void main(String[] args) {

        int a, b, temp;
        a = 5;
        b = 20;
        System.out.println("Normal input : a, b = " + a + ", " + +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }
}
