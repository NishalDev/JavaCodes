package HashMap;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 4, 4, 2 };
        int res = majorityElement(nums);
        System.out.println(res);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;
        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }
        return res;
    }
}
