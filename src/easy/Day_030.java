package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 */
public class Day_030 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1; i++) {
            if (i < 2){
                list.add(1);
            }else {
                for (int j = 1; j < i; j++){
                    if (j == 1){
                        list.add(j, list.get(j-1) + list.get(j));
                    }else {
                        list.set(j, list.get(j) + list.get(j + 1));
                    }
                }
            }
        }
        return list;
    }
}
