import java.util.Arrays;

public class updatingarray {
    public static void main(String[] args) {
        int[] myarray = new int[5];
        for(int i = 0; i<myarray.length; i++)
        {
          myarray[i] = i;
        }
        System.out.println(Arrays.toString(myarray));
    }
}