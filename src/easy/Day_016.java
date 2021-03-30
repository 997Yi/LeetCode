package easy;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 *
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 提示：
 *
 *     每个字符串仅由字符 '0' 或 '1' 组成。
 *     1 <= a.length, b.length <= 10^4
 *     字符串如果不是 "0" ，就都不含前导零。
 */
public class Day_016 {
    public String addBinary(String a, String b) {
//        return Integer.toBinaryString(
//                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
//        );

        StringBuffer result = new StringBuffer();
        int n = Math.max(a.length(), b.length());
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            tmp += i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            result.append((char) (tmp % 2 + '0'));
            tmp /= 2;
        }
        if (tmp > 0) {
            result.append('1');
        }
        result.reverse();
        return result.toString();
    }
}
