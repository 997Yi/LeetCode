package algorithm;

import algorithm.排序.冒泡排序;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        int[] array = new int[]{4,5,2,7,2,87,46,85,12};
        冒泡排序 sorted = new 冒泡排序();
        sorted.sort(array);
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
