package leetcode003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {// t m m z u x t

        int start = 0, end = 0, ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char c;

        for (end = 0; end < s.length(); end++) {
            c = s.charAt(end);

            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(c), start);
            }

            ans = Math.max(ans, end - start + 1);
            map.put(c, end + 1);
        }
        return ans;
    }
}
