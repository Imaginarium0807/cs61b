import java.util.*;
public class stack_practice2 {
    public static void main(String args[]) {
        Stack<String> myStack = new Stack<>();
        myStack.push("I am at the bottom.");
        myStack.push("I am in the middle.");
        myStack.push("I am at the top.");

        Deque<Integer> myStack2 = new ArrayDeque<>();
        System.out.println( myStack2);

    }
}