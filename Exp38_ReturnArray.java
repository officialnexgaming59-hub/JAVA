public class Exp38_ReturnArray {

    static int[] getArray()
    {
        int arr[] = {1,2,3,4,5};

        return arr;
    }

    public static void main(String[] args) {

        int result[] = getArray();

        for(int i:result)
        System.out.print(i+" ");
    }
}