package homework_week2;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program01 {
    int a = 10;
    int b = 5;

    public static void main(String[] args) {
        Program01 myMethod1 = new Program01();
        System.out.println(myMethod1.a);
        System.out.println(myMethod1.b);

    }



    public void myMethod1(){
        System.out.println(a);
        System.out.println(b);

    }

}

