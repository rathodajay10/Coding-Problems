package leetcode.premium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcab";
        int substringLegth = findLength(s);
        System.out.println(substringLegth);
    }
//logic is *
    /*
    iterate first should have left and right pointer

     */
    private static int findLength(String s) {
        int n = s.length(), ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int j=0, i = 0; j < n ; j++) {
           if (map.containsKey(s.charAt(j))){
               i = Math.max(map.get(s.charAt(j)),i);
           }
           ans = Math.max(ans,j-i+1);
           map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
