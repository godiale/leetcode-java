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
            for (int d = 1; d <= 2; ++d) {
                int ib = n, ie = n + d;
                while (ib >= 0 && ie <= s.length() && s.charAt(ib) == s.charAt(ie - 1)) {
                    if (ie - ib > ce - cb) {
                        cb = ib;
                        ce = ie;
                    }
                    --ib;
                    ++ie;
                }
            }
        }
        return s.substring(cb, ce);
    }
}
