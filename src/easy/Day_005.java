package easy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */

public class Day_005 {
    public String longestCommonPrefix_1(String[] strs) {
        String result = "";
        if (strs.length == 0){
            return result;
        }
        if (strs.length == 1){
            return strs[0];
        }
        for (int i=1; i<=strs[0].length(); i++){
            for (int j=1; j<strs.length; j++){
                if (i > strs[j].length() || !strs[j].substring(0,i).equals(strs[0].substring(0,i))){
                    return result;
                }
            }
            result = strs[0].substring(0,i);
        }

        return result;
    }

    public String longestCommonPrefix_2(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String result = strs[0];
        for (int i=1; i<strs.length; i++){
            int j = 0;
            for (;j<result.length() && j<strs[i].length();j++){
                if (result.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            result = result.substring(0, j);
        }

        return result;
    }
}
