import java.util.*; //importing the stack class
public class try_string1 {


    public static void main (String[] args)
    {

        // print char according to index of a string
        String myStr = "apple";
        char a = myStr.charAt(0);
        System.out.println(a);

        // print numeric value according to index of a string
        String num1 = "1314521";
        // 
        int s = num1.charAt(5) - '0';
        System.out.println(s);
        //
        char b = num1.charAt(5);
        int c = b;
        System.out.println(c);

    }
}
