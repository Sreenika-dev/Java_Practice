import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 90, 2, 71, 62, 11};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) //helps in iterating and changing the index values by incrementing or decrementing them after every swap has taken place
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            swap(arr, start, end);
            start ++;
            end --;
        }

    }


    static void swap(int[] arr, int index1, int index2)
    {
       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;
    }

}
