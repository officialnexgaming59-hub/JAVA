public class Exp51_NestedTry {

    public static void main(String[] args) {

        try {

            try {

                int a = 10/0;

            }

            catch(ArithmeticException e) {

                System.out.println("Arithmetic Exception");
            }

            int arr[] = {1,2,3};

            System.out.println(arr[5]);

        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Exception");
        }
    }
}