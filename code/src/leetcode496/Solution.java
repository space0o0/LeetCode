package leetcode496;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        int num;

        for (int i = nums2.length - 1; i >= 0; i--) {

            num = nums2[i];

            while (!stack.empty() && num >= stack.peek()) {
                stack.pop();
            }

            hashMap.put(num, stack.empty() ? -1 : stack.peek());

            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            array[i] = hashMap.get(nums1[i]);
        }

        return array;
    }
}
