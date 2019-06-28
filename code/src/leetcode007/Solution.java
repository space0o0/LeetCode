package leetcode007;

public class Solution {
    public int reverse(int x) {

        int ans = 0;
        while (x != 0) {
            int z = x % 10;
            x = x / 10;

//            if (x>)

            ans = ans * 10 + z;

        }



        return ans;
    }
}
