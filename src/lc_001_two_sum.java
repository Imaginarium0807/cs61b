import java.util.HashMap; // import the HashMap class
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class lc_001_two_sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> run_map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (run_map.containsKey(target - x)) {
                return new int[]{run_map.get(target - x), i};
            }
            run_map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args){
        int[] intArray = new int[]{2,5,2,6,3};
        int target = 5;
        int[] result = twoSum(intArray, target);
        System.out.println(Arrays.toString(result));
    }
}

//my fking Java lc