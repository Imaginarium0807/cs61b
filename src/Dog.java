public class Dog {

    public static void makeNoise(int weightInPounds){
        if (weightInPounds < 10) {
            System.out.println("small dog");
        } else if (weightInPounds < 30) {
            System.out.println("bark.bark");
        } else {
            System.out.println("Good dog!");
        }
    }
    public static void main(String[] args){
        int weightInPounds = 12;

        makeNoise(weightInPounds);
    }
}
