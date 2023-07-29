import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        System.out.println("These are armstrong numbers");
        for( int i = 100; i< 1000; i++)
        {
           if(checkarmStrong(i))
           {
               System.out.println(i);
           }
        }
    }

    static boolean checkarmStrong(int n)
    {
        Scanner sc = new Scanner(System.in);
        int arms = n;
        int sum = 0;
        while (n > 0)
        {
            int rem  = n % 10;
            n = n / 10;
            sum  +=  rem*rem*rem;

        }

        if( sum == arms)
        {
           return true;
        }
        else
        {
           return false;
        }


    }
}
