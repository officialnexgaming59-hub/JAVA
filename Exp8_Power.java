import java.util.Scanner;

public class Exp8_Power {

    public static void main(String[] args) {

        int base, exp, result = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        base = sc.nextInt();

        System.out.print("Enter exponent: ");
        exp = sc.nextInt();

        for(int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println("Result = " + result);
    }
}