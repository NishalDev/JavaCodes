package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] nums1 = { 4, 4, 4, 3 };
        int[] nums2 = { 3, 4, 4, 4, 2 };
        int[] res = intersect(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] intersectArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersectArray[i] = result.get(i);
        }
        return intersectArray;
    }
}
