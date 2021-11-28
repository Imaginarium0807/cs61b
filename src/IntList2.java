import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IntList2 {
    public int first_number;
    public IntList rest_is_list;
    public int numNew = 8;

    public IntList2() {

    }

    public static void myMethod1(){
        System.out.println("Hellow Mario");
    }

    public static void main(String[] args) {
        // you can access attributes by creating an object of the class, and by using the dot L.numNew
        // create an object called L and print the value of x
        IntList2 L = new IntList2();
        L.first_number = 100;
        L.rest_is_list = null;
        System.out.println(L.first_number);
        System.out.println(L.numNew);

        myMethod1();

    }

}
