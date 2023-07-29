import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " "+ b);
    }

  // for primitives the params are passed as value not as reference so that is the reason why a and b didn't chnage
    //instead we got a new a and b that are only scoped to swap function
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " "+ b);
    }

}