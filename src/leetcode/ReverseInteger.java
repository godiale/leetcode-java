package leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return -reverse(-x);
        }
        long y = 0;
        while (x > 0) {
            y = y * 10 + x % 10;
            x = x / 10;
            if (y > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int)y;
    }
}
