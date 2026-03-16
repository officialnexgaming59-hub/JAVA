import java.util.Scanner;

public class Exp45_ArithmeticExceptionDemo {

    public static void main(String[] args) {

        int a,b;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter a: ");
            a = sc.nextInt();

            System.out.print("Enter b: ");
            b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);
        }

        catch(ArithmeticException e) {

            System.out.println("Division by zero not allowed");
        }
    }
}