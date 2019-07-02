package leetcode005;

public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();

        if (len <= 1) {
            return s;
        }

        String maxStr = String.valueOf(s.charAt(0));
        //动态规划

        boolean[][] dp = new boolean[len][len];
        int l = 0, r = 0;

        for (l = 0; l < len; l++) {
            for (r = l + 1; r < len; r++) {

                if (s.charAt(l) == s.charAt(r) && ((r - l >= 1) || dp[l + 1][r - 1])) {
                    dp[l][r] = true;

                    String c = s.substring(l, r + 1);
                    if (c.length() > maxStr.length()) {
                        maxStr = c;
                    }

                }
            }
        }
        return maxStr;
    }
}
