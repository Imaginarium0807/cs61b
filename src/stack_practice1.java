import java.util.*;
public class stack_practice1 {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> STACK = new Stack<String>();

        // Use push() to add elements into the Stack
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");
        STACK.add("fuckkkk");
        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + STACK.peek());


        // stack push
        STACK.push("World");
        System.out.println("after push: " + STACK);

        // pop
        STACK.pop();
        System.out.println("after pop: " + STACK);

    }
}