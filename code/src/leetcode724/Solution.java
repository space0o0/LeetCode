package leetcode724;

public class Solution {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int left = 0;
        int index=-1;

        for (int i = -1; i < nums.length - 1; i++) {

            if (left * 2 + nums[i + 1] == sum) {
                index=i+1;
                break;
            }
            left += nums[i+1];

        }
        return index;
    }
}
