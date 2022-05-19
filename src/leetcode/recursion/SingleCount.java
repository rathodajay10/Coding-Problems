package leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

public class SingleCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 3, 5, 5};
        findSingleelement(arr);
    }

    private static void findSingleelement(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int a : arr) {
            if (hm.containsKey(hm.get(a))) {
                int count = 1;
                count++;
                hm.put(a, count);
            } else {
                int count = 1;
                hm.put(a, count);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getKey() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
