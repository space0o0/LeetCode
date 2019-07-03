package leetcode747;

public class Solution {
    public int dominantIndex(int[] nums) {
        //findmax
        int max = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                continue;
            }

            if (nums[i] == max) {
                index = i;
                continue;
            }

            if (max / nums[i] < 2) {
                index = -1;
                break;
            }
        }
        return index;
    }

    public int domiantIndex(int[] nums) {
        //find max and second max nums
        int max = 0, secondMax = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }else {
                if (nums[i] > secondMax) {
                    secondMax = nums[i];
                }
            }
        }

        return secondMax * 2 <= max ? maxIndex : -1;
    }
}
