package leetcode;

public class Roman {
    public int romanToInt(String s) {
        int res = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            int mul = 1;
            if (c == 'I') {
                if (cur >= 10) {
                    res += cur;
                    cur = 0;
                }
                cur += 1;
            }
            else if (c == 'D' || c == 'L' || c == 'V') {
                if (c == 'D') {
                    mul = 100;
                } else if (c == 'L') {
                    mul = 10;
                }
                if (cur == mul) {
                    res += 4 * mul;
                    cur = 0;
                } else {
                    res += 5 * mul;
                }
            }
            else if (c == 'M' || c == 'C' || c == 'X') {
                if (c == 'M') {
                    mul = 100;
                } else if (c == 'C') {
                    mul = 10;
                }
                if (cur >= 100 * mul) {
                    res += cur;
                    cur = 0;
                }
                if (cur == mul) {
                    res += 9 * mul;
                    cur = 0;
                } else {
                    cur += 10 * mul;
                }
            }
            else {
                return -1;
            }
        }
        res += cur;
        return res;
    }
}
