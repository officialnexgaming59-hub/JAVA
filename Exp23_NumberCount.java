import java.util.Scanner;

public class Exp23_NumberCount {

    public static void main(String[] args) {

        int num;
        int pos = 0, neg = 0, zero = 0;

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.print("Enter number: ");
            num = sc.nextInt();

            if(num > 0)
                pos++;
            else if(num < 0)
                neg++;
            else
                zero++;

            System.out.print("Do you want to continue (y/n)? ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Zeros: " + zero);
    }
}