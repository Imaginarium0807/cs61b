public class Recursion {
    public static int SumRecur(int start, int end){
        if (end > start) {
            return end + SumRecur(start, end - 1);

        } else {
            return end;
        }
    }
    public static void main(String[] args){
        int result = SumRecur(5, 10);
        System.out.println(result);
    }
}
