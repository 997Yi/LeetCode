package easy;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 *     I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 *     X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 *     C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 *
 *
 * 示例 1:
 *
 * 输入: "III"
 * 输出: 3
 *
 * 示例 2:
 *
 * 输入: "IV"
 * 输出: 4
 *
 * 示例 3:
 *
 * 输入: "IX"
 * 输出: 9
 *
 * 示例 4:
 *
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 *
 * 示例 5:
 *
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 *
 *
 * 提示：
 *
 *     题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
 *     IC 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。
 *     关于罗马数字的详尽书写规则，可以参考 罗马数字 - Mathematics 。
 */

public class Day_004 {

    public int romanToInt_1(String s) {
        int result = 0;//存放最终结果
        int temp; //存放单个罗马字符的int值

        //存放String分隔成的String[]
        String[] strings = new String[s.length()];

        //String转换成String[]
        char[] chars = s.toCharArray();
        for (int i=0; i<s.length(); i++){
            strings[i] = new String(Character.toString(chars[i]));
        }


        for (int i=0; i<strings.length; i++){
            temp = Roman.valueOf(strings[i]).getValue();
            if (i > 0){
                int last = Roman.valueOf(strings[i-1]).getValue();
                if (temp > last){
                    temp -= 2 * last;
                }
            }
            result += temp;

        }

        return result;
    }

    public static int romanToInt_2(String s) {
        int result = 0;//存放最终结果
        int temp; //存放单个罗马字符的int值

        //存放String分隔成的String[]
        String[] strings = new String[s.length()];

        //String转换成String[]
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            strings[i] = new String(Character.toString(chars[i]));
        }


        for (int i = 0; i < strings.length; i++) {

            switch (strings[i]) {
                case "I":
                    temp = 1;
                    break;
                case "V":
                    temp = 5;
                    break;
                case "X":
                    temp = 10;
                    break;
                case "L":
                    temp = 50;
                    break;
                case "C":
                    temp = 100;
                    break;
                case "D":
                    temp = 500;
                    break;
                case "M":
                    temp = 1000;
                    break;
                default:
                    temp = 0;
            }
            if (i > 0) {
                int last;
                switch (strings[i-1]) {
                    case "I":
                        last = 1;
                        break;
                    case "V":
                        last = 5;
                        break;
                    case "X":
                        last = 10;
                        break;
                    case "L":
                        last = 50;
                        break;
                    case "C":
                        last = 100;
                        break;
                    case "D":
                        last = 500;
                        break;
                    case "M":
                        last = 1000;
                        break;
                    default:
                        last = 0;
                }
                if (temp > last) {
                    temp -= 2 * last;
                }
            }
            result += temp;

        }

        return result;
    }

    public static int romanToInt_3(String s) {
        int result = 0;//存放最终结果
        int temp; //存放单个罗马字符的int值

        //存放String分隔成的String[]
        String[] strings = new String[s.length()];

        char[] chars = s.toCharArray();

        for (int i = 0; i < strings.length; i++) {
            String string = new String(Character.toString(chars[i]));
            switch (string) {
                case "I":
                    temp = 1;
                    break;
                case "V":
                    temp = 5;
                    break;
                case "X":
                    temp = 10;
                    break;
                case "L":
                    temp = 50;
                    break;
                case "C":
                    temp = 100;
                    break;
                case "D":
                    temp = 500;
                    break;
                case "M":
                    temp = 1000;
                    break;
                default:
                    temp = 0;
            }
            if (i > 0) {
                int last;
                string = new String(Character.toString(chars[i-1]));
                switch (string) {
                    case "I":
                        last = 1;
                        break;
                    case "V":
                        last = 5;
                        break;
                    case "X":
                        last = 10;
                        break;
                    case "L":
                        last = 50;
                        break;
                    case "C":
                        last = 100;
                        break;
                    case "D":
                        last = 500;
                        break;
                    case "M":
                        last = 1000;
                        break;
                    default:
                        last = 0;
                }
                if (temp > last) {
                    temp -= 2 * last;
                }
            }
            result += temp;

        }

        return result;
    }
}

enum Roman{
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int value;

    private Roman(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

/**
 * switch (str){
 *                 case "I":
 *                     temp = 1;
 *                     break;
 *                 case "V":
 *                     temp = 5;
 *                     break;
 *                 case "X":
 *                     temp = 10;
 *                     break;
 *                 case "L":
 *                     temp = 50;
 *                     break;
 *                 case "C":
 *                     temp = 100;
 *                     break;
 *                 case "D":
 *                     temp = 500;
 *                     break;
 *                 case "M":
 *                     temp = 1000;
 *                     break;
 *                 default:
 *                     temp = 0;
 *             }
 *
 */