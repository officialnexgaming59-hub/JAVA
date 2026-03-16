  eimport java.util.Scanner;

public class Exp1_BitwiseOperators {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("Bitwise AND (a & b): " + (a & b));
        System.out.println("Bitwise OR (a | b): " + (a | b));
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b));
        System.out.println("Bitwise Complement (~a): " + (~a));
        System.out.println("Left Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));
    }
}