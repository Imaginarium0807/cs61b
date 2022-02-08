import java.util.*;

public class increment_practice {
    public static void main(String[] args)
    {
        // initialize i
        int ii = 4;
        System.out.println("Post-Increment");

        // i values is incremented to 1 after returning
        // current value i.e; 0
        System.out.println(ii++);
        System.out.println(ii);
        System.out.println(++ii);

        // initialized to 0
        int j = 4;
        System.out.println("Pre-Increment");

        // j is incremented to 1 and then it's value is
        // returned
        System.out.println(++j);
        System.out.println(j);


        // check for loop
        System.out.println("i++ from here");
        String s = "hahaha";
        for (int i = 0; i < s.length(); ++i ){

            String str = String.valueOf(i);
            System.out.println(str);
        }
    }
}


   // int a = 0;
 //   int b = a++; // b = 0; a = 1

    //a = 0;
 //       b = ++a: // b = 1; a = 1