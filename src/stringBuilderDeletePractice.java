import java.util.*;
//public StringBuilder delete(int start, int end)
public class stringBuilderDeletePractice {
    public static void main(String[] args)
    {

        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder
                str
                = new StringBuilder("GeeksforGeeks");

        // print string
        System.out.println("Before removal String = "
                + str.toString());

        // remove the substring from index 8 to 8
        StringBuilder afterRemoval = str.delete(8, 8);

        // start equal to end so no change in string
        // print string after removal of substring
        System.out.println("After removal of SubString"
                + " start=8 to end=8"
                + " String becomes => "
                + afterRemoval.toString());

        // remove the substring from index 1 to 8
        afterRemoval = str.delete(1, 8);

        // print string after removal of substring
        System.out.println("After removal of SubString"
                + " start=1 to end=8"
                + " String becomes => "
                + afterRemoval.toString());
    }
}
