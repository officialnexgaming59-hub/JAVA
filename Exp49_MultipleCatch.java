public class Exp49_MultipleCatch {

    public static void main(String[] args) {

        try {

            int arr[] = new int[5];

            arr[10] = 50;

            int a = 10/0;
        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Exception");
        }

        catch(ArithmeticException e) {

            System.out.println("Arithmetic Exception");
        }
    }
}