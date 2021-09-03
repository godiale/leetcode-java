package leetcode;

public class Roman {
    public int romanToInt_Brute(String s) {
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

    private int valueOf(char c) {
        switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default:  return 0;
        }
    }

    private int penalty(char c1, char c2) {
        if (c1 == 'I' && (c2 == 'V' || c2 == 'X')) {
            return -2;
        }
        else if (c1 == 'X' && (c2 == 'L' || c2 == 'C')) {
            return -20;
        }
        else if (c1 == 'C' && (c2 == 'D' || c2 == 'M')) {
            return -200;
        }
        return 0;
    }

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length()-1; ++i) {
            char c  = s.charAt(i);
            char cn = s.charAt(i+1);
            res += valueOf(c);
            res += penalty(c, cn);
        }
        res += valueOf(s.charAt(s.length()-1));
        return res;
    }
}
