package easy;
/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */

import java.util.ArrayList;
import java.util.List;

public class Day_029 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0){
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++){
            List<Integer> tmp = new ArrayList<Integer>(list);
            if (i < 2){
                tmp.add(1);
            }else{
                for (int j = 1; j < i; j++){
                    if (j == i - 1){
                        tmp.add(j, list.get(j-1) + list.get(j));
                    }
                    tmp.set(j, list.get(j-1) + list.get(j));
                }
            }
            list = tmp;
            result.add(tmp);
        }
        return result;


    }
}
