import java.util.HashMap;
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    public static void main(String[] args) {
        int[] n1 = new int[]{2, 7, 11, 15};
        int n2 = 9;
        System.out.println(twoSum(n1, n2));
    }
}
