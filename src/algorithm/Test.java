package algorithm;

import algorithm.排序.快速排序;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        int[] array = new int[]{4,85,2,7,12,87,46,5,2};
        快速排序 sorted = new 快速排序();
        sorted.sort(array, 0, array.length-1);
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
