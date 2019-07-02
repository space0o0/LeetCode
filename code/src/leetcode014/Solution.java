package leetcode014;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){return "";}
        //每个单词的第一位开始扫描
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {

                if (c != strs[j].charAt(i) || i == strs[j].length()) {
                    return strs[j].substring(0, i);
                }

            }
        }
        return strs[0];
    }
}
