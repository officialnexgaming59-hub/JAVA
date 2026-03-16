import java.util.Scanner;

public class Exp12_TernaryOperator {

    public static void main(String[] args) {

        int a,b,max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        max = (a>b)?a:b;

        System.out.println("Greater number is: "+max);
    }
}