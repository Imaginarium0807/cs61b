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

    public static void LoopDog(int x){
        for(int i = x; i < 16; i++){

            System.out.println(i);
        }
    }

    public static void main(String[] args){
        // first function
        int x = 0;
        WhileLoop(x);
        // second function
        CorePractice myObj = new CorePractice();
        int y = 6;
        LoopDog(y);
    }

}
