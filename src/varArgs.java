import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {

        demo("hello how are you");
        demo(1,5,8,9,0);

    }
    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String s)
    {
        System.out.println(s);
    }
}
