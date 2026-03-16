import java.util.Scanner;

public class Exp15_MultiplicationTable {

    public static void main(String[] args) {

        int num;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        num=sc.nextInt();

        System.out.println("Table:");

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }

        System.out.println("\nReverse Table:");

        for(int i=10;i>=1;i--)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
