package easy;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Day_002 {

    int reverse(int x) {
        int y;

        StringBuffer sb;

        if (x < 0){
            sb = new StringBuffer(String.valueOf(Math.abs(x)));
            try{
                y = -Integer.parseInt(sb.reverse().toString());
            }catch (Exception e){
                return 0;
            }
        }else {
            sb = new StringBuffer(String.valueOf(x));
            try{
                y = Integer.parseInt(sb.reverse().toString());
            }catch (Exception e){
                return 0;
            }


        }

        return y;
    }
}

/**
 * long n = 0;
 *         while(x != 0) {
 *             n = n*10 + x%10;
 *             x = x/10;
 *         }
 *         return (int)n==n? (int)n:0;
 */
