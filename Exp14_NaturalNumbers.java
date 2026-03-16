import java.util.Scanner;

public class Exp14_NaturalNumbers {

    public static void main(String[] args) {

        int n;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        n=sc.nextInt();

        System.out.println("1 to n:");

        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }

        System.out.println("\nn to 1:");

        for(int i=n;i>=1;i--)
        {
            System.out.print(i+" ");
        }
    }
}