package algorithm.排序;

public class 冒泡排序 {

    public void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                    flag = false;
                }
            }

            if (flag){
                break;
            }
        }
    }
}
