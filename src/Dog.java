public class Dog {
    public static int weightInPounds; ///Instance variable
    public static int Dog(int startingWeight){ /// Constructor
        weightInPounds = startingWeight;
        return weightInPounds;
    }
    public static String makeNoise(int weightInPounds){ ///non-static method, instance method
        if (weightInPounds < 10) {
            System.out.println("small dog");
        } else if (weightInPounds < 30) {
            System.out.println("bark.bark");
        } else {
            System.out.println("Good dog!");
        }
        return "test";
    }
    public static void main(String[] args){
        int weightInPounds = 12;
        System.out.println(Dog(weightInPounds));
        System.out.println(makeNoise(weightInPounds));
    }
}
