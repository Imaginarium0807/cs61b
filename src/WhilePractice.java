public class WhilePractice {
    /*While keyword lets you repeat a block of code as long as some conditions is true*/
    public static void main(String[] args) {
        int bottles = 99;
        while (bottles > 0) {
            System.out.println(bottles + " bottles of bear on the wall.");
            bottles = bottles - 4;
        }
    }
}
