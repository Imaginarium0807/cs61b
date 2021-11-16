import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);


        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.println(L.toString());
        Stream.of(L.toString()).forEach(System.out::println);

    }

}
