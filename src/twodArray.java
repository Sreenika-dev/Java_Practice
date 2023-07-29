import java.util.Arrays;
import java.util.Scanner;

public class twodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[3][3];
        for (int i = 0; i< arr2D.length; i++)
        {
           for(int j = 0; j < arr2D[i].length ; j++)
           {
               arr2D[i][j] = sc.nextInt();
           }
        }

        for(int i = 0; i< arr2D.length; i++)
        {
            for(int j = 0; j < arr2D[i].length; j++)
            {
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();

        }


    }
}
