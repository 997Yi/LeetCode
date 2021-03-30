package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合。
 *
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class Day_006 {
    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() % 2 != 0){
            return false;
        }

        List<Character> list = new LinkedList();
        list.add(s.charAt(0));
        for (int i=1; i<s.length(); i++){
            if (list.size() == 0){
                list.add(s.charAt(i));
                continue;
            }
            if (f(list.get(list.size()-1), s.charAt(i))){
                list.remove(list.size()-1);
            }else{
                list.add(s.charAt(i));
            }
        }
        if (list.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public boolean f(Character c1, Character c2){
        if (c1 == '(' && c2 == ')'){
            return true;
        }
        if (c1 == '[' && c2 == ']'){
            return true;
        }
        if (c1 == '{' && c2 == '}'){
            return true;
        }
        return false;
    }
}
