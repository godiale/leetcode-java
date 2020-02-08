package leetcode;

public class LongestPalindrome {
    static boolean isPalindrome(String s, int b, int e) {
        int l = e - b;
        int h = l / 2;
        for (int n = 0; n < h; ++n) {
            if (s.charAt(b + n) != s.charAt(b + l - n - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length());
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int cb = 0, ce = 1;
        for (int n = 0; n < s.length(); ++n) {
            for (int m = n + 1; m <= s.length(); ++m) {
                if (m - n > ce - cb) {
                    if (isPalindrome(s, n, m)) {
                        cb = n;
                        ce = m;
                    }
                }
            }
        }
        return s.substring(cb, ce);
    }
}
