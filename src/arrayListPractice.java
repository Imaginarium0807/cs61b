import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.*;
public class arrayListPractice {
    public static void main(String args[]) {
        //using an Array
        String[] fruits = new String[3]; // make a 3 element array
        fruits[0]="apple";
        fruits[2]="banana";

        System.out.println(fruits[1]); // output the second element

        //using an Array for integer

        int[] test = new int[3]; // make a 3 element array
        test[0]=3;
        test[2]=4;

        System.out.println(test[1]); // output the second element


        //using a List
        ArrayList<String> fruitsList = new ArrayList<String>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        System.out.println(fruitsList.get(1));

    }
}
