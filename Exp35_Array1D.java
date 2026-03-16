import java.util.Scanner;

public class Exp35_Array1D {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}