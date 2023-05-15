package homework_week2;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program04 {

    static int a = 10;
    static int b = 20;
    int c = 30;
    int d = 40;

    public static void main(String [] args){
        Program04 obj = new Program04();
        m8();
        obj.m9();

    }
public static void m8(){
    Program04 m8 = new Program04();
    System.out.println(a);
    System.out.println(b);
    System.out.println(m8.c);
    System.out.println(m8.d);

}
    public void m9 () {
    Program04 m9 = new Program04();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
