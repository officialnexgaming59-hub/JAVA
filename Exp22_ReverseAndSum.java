import java.util.Scanner;

public class Exp22_ReverseAndSum {

    public static void main(String[] args) {

        int num, rev = 0, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

        while(num != 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);
        System.out.println("Sum of digits: " + sum);
    }
}