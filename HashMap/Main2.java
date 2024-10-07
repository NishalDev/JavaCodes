package HashMap;

import java.util.HashMap;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 7, 4, 5 };
        int tar = 9;
        int[] res = twoSum(nums, tar);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
