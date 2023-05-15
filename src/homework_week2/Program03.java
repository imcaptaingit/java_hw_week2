package homework_week2;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program03 {
    static int a = 20;
    int b = 30;

    public static void main(String[] args) {
        Program03 m1 = new Program03();
        myMethod02();
        System.out.println(a);
        System.out.println(m1.b);
    }

    public static void myMethod02() {
        Program03 myMethod02 = new Program03();
        System.out.println(a);
        System.out.println(myMethod02.b);


    }

    public void m1() {
        Program03 m1 = new Program03();
        System.out.println(a);
        System.out.println(m1.b);
    }
}