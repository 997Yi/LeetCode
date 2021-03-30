package algorithm.排序;

public class 快速排序 {
    public void sort(int[] arr, int start, int end) {
        if (start < end){
            int left = start;
            int right = end;
            int pivot = arr[start];
            while (left < right) {
                while (left < right && arr[right] >= pivot){
                    right--;
                }
                if (left < right){
                    arr[left++] = arr[right];
                }

                while (left < right && arr[left] < pivot){
                    left++;
                }
                if (left < right){
                    arr[right--] = arr[left];
                }
            }
            arr[left] = pivot;
            sort(arr, start, left-1);
            sort(arr, left+1, end);

        }

    }
}
