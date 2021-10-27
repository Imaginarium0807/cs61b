import java.util.HashMap;
public class twoSum {
    public int[] twoSum(int[] nums, int[] target){
        Map<Integer, Integer> map = new HashMap<int, int>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - num[i];
        if (map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] n1 = new int[]{2, 7, 11, 15};
        int[] n2 = new int[]{9};
        System.out.println(twoSum(n1, n2));
    }
}
