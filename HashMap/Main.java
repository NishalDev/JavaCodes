package HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "leetlcode";
        int res = func(str);
        System.out.print(res);
    }

    public static int func(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
