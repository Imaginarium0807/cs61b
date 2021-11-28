import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IntList2 {
    public int first_number;
    public IntList rest_is_list;

    public IntList2() {
        int x = 5;
    }

    public static void main(String[] args) {
        IntList2 L = new IntList2();
        L.first_number = 100;
        L.rest_is_list = null;
        System.out.println(L.first_number);
    }

}
