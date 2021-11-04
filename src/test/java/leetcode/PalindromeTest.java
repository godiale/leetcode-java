package leetcode;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(TimingExtension.class)
public class PalindromeTest {
    @Test
    public void test() {
        Palindrome pm = new Palindrome();
        assertTrue(pm.isPalindrome(0));
        assertTrue(pm.isPalindrome(1));
        assertTrue(pm.isPalindrome(121));
        assertTrue(pm.isPalindrome(2332));
        assertTrue(pm.isPalindrome(44455444));
        assertTrue(pm.isPalindrome(2147447412));
        assertFalse(pm.isPalindrome(-1));
        assertFalse(pm.isPalindrome(10));
        assertFalse(pm.isPalindrome(12));
        assertFalse(pm.isPalindrome(-989));
        assertFalse(pm.isPalindrome(1000));
        assertFalse(pm.isPalindrome(3332));
        assertFalse(pm.isPalindrome(444553444));
        assertFalse(pm.isPalindrome(-1256776521));
        assertFalse(pm.isPalindrome(Integer.MAX_VALUE));
        assertFalse(pm.isPalindrome(Integer.MIN_VALUE));
    }

    @Test
    public void testMany() {
        Palindrome pm = new Palindrome();
        for (int i=0; i < 100000; ++i) {
            pm.isPalindrome(234565432);
        }
    }
}
