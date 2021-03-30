package easy;

public class Day_003 {

    public boolean isPalindrome_1(int x) {
       return String.valueOf(x).equals(new StringBuffer(String.valueOf(x)).reverse().toString());
    }

    public boolean isPalindrome_2(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int result = 0;
        int y = x;
        while (y != 0){
            result = 10 * result + y % 10;
            y /= 10;
        }
        return x == result ? true : false;
    }

    public boolean isPalindrome_3(int x) {
        char[] y = String.valueOf(x).toCharArray();
        int start = 0;
        int end = y.length - 1;
        while (start < end){
            if (y[start] == y[end]){
                start++;
                end--;
                continue;
            }
            return false;
        }
        return true;
    }
}
