import java.util.*; //importing the stack class
class MyClass2{
    public static void main (String[] args)
    {
        // Creating a Stack
        Stack<String> run_stack = new Stack<>();
        run_stack.push("first");
        System.out.println(run_stack);
        run_stack.push("second");
        System.out.println(run_stack);
        run_stack.push("third");
        System.out.println(run_stack);

        System.out.println(run_stack.pop());
        System.out.println(run_stack);
        run_stack.pop();
        System.out.println(run_stack);
        run_stack.pop();
        System.out.println(run_stack);
    }
}