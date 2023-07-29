import java.util.Arrays;
import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];
        for (int i = 0; i< str.length ; i++)
        {
           str[i] = sc.next();
        }

        for(int i = 0; i< str.length; i++)
        {
            System.out.print(str[i] + " ");
        }
    }
}
