public class Exp37_ArrayParameter {

    static void display(int arr[])
    {
        for(int i:arr)
        System.out.print(i+" ");
    }

    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};

        display(a);
    }
}