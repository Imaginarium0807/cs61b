import java.util.HashMap; // import the HashMap class
import java.util.*;
import java.lang.*;
import java.io.*;
// input: nums: List[int], target: int, return List[int]
public class test3 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            // if we don't found the solution we have to update our HashMap
            map.put(nums[i], i);
        }
        return nums;

    }


    public static void main(String[] args) {
        int[] intArray = new int[]{ 3,  5,4,  7009};
        int target = 9;
        int[] result = twoSum(intArray, target);
        System.out.println(Arrays.toString(result));
    }
}
