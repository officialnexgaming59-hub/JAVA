public class Exp7_Prime1to50 {

    public static void main(String[] args) {

        int i, j;

        for(i = 2; i <= 50; i++) {
            boolean prime = true;

            for(j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime)
                System.out.print(i + " ");
        }
    }
}