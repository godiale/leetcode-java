package leetcode;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(TimingExtension.class)
public class PalindromeTest {
    @Test
    public void test() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(0));
        assertTrue(palindrome.isPalindrome(1));
        assertTrue(palindrome.isPalindrome(121));
        assertTrue(palindrome.isPalindrome(2332));
        assertTrue(palindrome.isPalindrome(44455444));
        assertTrue(palindrome.isPalindrome(2147447412));
        assertFalse(palindrome.isPalindrome(-1));
        assertFalse(palindrome.isPalindrome(10));
        assertFalse(palindrome.isPalindrome(12));
        assertFalse(palindrome.isPalindrome(-989));
        assertFalse(palindrome.isPalindrome(1000));
        assertFalse(palindrome.isPalindrome(3332));
        assertFalse(palindrome.isPalindrome(444553444));
        assertFalse(palindrome.isPalindrome(-1256776521));
        assertFalse(palindrome.isPalindrome(Integer.MAX_VALUE));
        assertFalse(palindrome.isPalindrome(Integer.MIN_VALUE));
    }

    @Test
    public void testMany() {
        Palindrome palindrome = new Palindrome();
        for (int i=0; i < 100000; ++i) {
            palindrome.isPalindrome(234565432);
        }
    }
}
