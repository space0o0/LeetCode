package leetcode001;

import java.util.HashMap;

public class Solution {

    public int[] twoSum1(int[] nums, int target) {

        int len = nums.length;
        int one = -1, two = -1;

        for (int i = 0; i < len; i++) {
            int diff = target - nums[i];

            if (i == len - 1) {
                break;
            }

            for (int j = i + 1; j < len; j++) {
                if (diff == nums[j]) {
                    one = i;
                    two = j;
                    break;
                }
            }
        }

        return new int[]{one, two};
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
