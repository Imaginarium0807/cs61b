public class CorePractice {
    public static void WhileLoop(int x){
        while (x < 5) {
            System.out.println("I am larger than 10");
            x++;
            if (x == 3){
                break;
            }
        }

    }

    public static void main(String[] args){
        int x = 0;
        WhileLoop(x);
    }
}
