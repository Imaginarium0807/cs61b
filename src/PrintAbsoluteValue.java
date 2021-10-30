public class PrintAbsoluteValue {

    public static void PrintValue(int x) {
        if (x < 0)
            System.out.println("I should negate X");
            x = -x;

        System.out.println(x);
    }
    public static void main(String[] args) {
        int x = -5;
        PrintValue(x);

    }
}