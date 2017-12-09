package leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long m = 1;
        int j = 1;
        int i = 1;

        while (m * 10 <= x) {
            m *= 10;
            ++j;
        }

        while (j > i) {
            int a = (int)(x / m);
            int b = x % 10;
            if (a != b) {
                return false;
            }
            x = x - (int)(a * m);
            x = (x - b) / 10;

            m /= 100;
            j--;
            i++;
        }

        return true;
    }
}
