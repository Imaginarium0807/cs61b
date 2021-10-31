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

    public static void WatchMe(String x){
        System.out.println(x);
    }

    public static void LoopDuck(int x ){
        for (int i2 = 1; i2 <= x; i2+=2){
            if (i2%5 ==0){
                System.out.println(i2);
                System.out.println("leftover 1");
            }

        }
    }

    public static void main(String[] args){
        // first function
        int x = 0;
        WhileLoop(x);
        // second function
        int y = 6;
        LoopDog(y);
        // 3nd function
        String a = "there is a duck";
        WatchMe(a);

        // 4th function
        int h = 8;
        LoopDuck(h);

    }

}
