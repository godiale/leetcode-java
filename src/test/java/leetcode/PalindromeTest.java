package leetcode;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
public class PalindromeTest {

    @Test
    public void test() {
        Palindrome palindrome = new Palindrome();
        assertEquals(true,  palindrome.isPalindrome(0));
        assertEquals(true,  palindrome.isPalindrome(1));
        assertEquals(false, palindrome.isPalindrome(-1));
        assertEquals(false, palindrome.isPalindrome(10));
        assertEquals(false, palindrome.isPalindrome(12));
        assertEquals(true,  palindrome.isPalindrome(121));
        assertEquals(false, palindrome.isPalindrome(-989));
        assertEquals(false, palindrome.isPalindrome(1000));
        assertEquals(true,  palindrome.isPalindrome(2332));
        assertEquals(false, palindrome.isPalindrome(3332));
        assertEquals(false, palindrome.isPalindrome(444553444));
        assertEquals(true,  palindrome.isPalindrome(44455444));
        assertEquals(false, palindrome.isPalindrome(-1256776521));
        assertEquals(true,  palindrome.isPalindrome(2147447412));
        assertEquals(false, palindrome.isPalindrome(Integer.MAX_VALUE));
        assertEquals(false, palindrome.isPalindrome(Integer.MIN_VALUE));
    }

    @Test
    public void testMany() throws Exception {
        Palindrome palindrome = new Palindrome();
        Method method = TestUtils.getMethod("leetcode.Palindrome", "isPalindrome");
        for (int i=0; i < 100000; ++i) {
            method.invoke(palindrome, 234565432);
        }
    }

}
