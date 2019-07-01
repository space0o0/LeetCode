package leetcode009;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int mod;
        int newInt = 0;
        int oldInt = x;
        while (oldInt != 0) {
            mod = oldInt % 10;
            newInt = newInt * 10 + mod;
            oldInt = oldInt / 10;
        }

        return newInt - x == 0;
    }
}
