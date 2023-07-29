import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter the numbers into array");
        for(int i=0; i<arr.length; i++)
        {
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number to search");
        int target = sc.nextInt();
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target)
    {
      for(int i=0; i < arr.length; i++)
      {
          if(target == arr[i])
          {
              return i;
          }

      }

      return -1;

    }


}
