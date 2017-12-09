package leetcode;

import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest extends Timeit {

    @Test
    public void test() {
        Palindrome palindrome = new Palindrome();
        Assert.assertEquals(true,  palindrome.isPalindrome(0));
        Assert.assertEquals(true,  palindrome.isPalindrome(1));
        Assert.assertEquals(false, palindrome.isPalindrome(-1));
        Assert.assertEquals(false, palindrome.isPalindrome(10));
        Assert.assertEquals(false, palindrome.isPalindrome(12));
        Assert.assertEquals(true,  palindrome.isPalindrome(121));
        Assert.assertEquals(false, palindrome.isPalindrome(-989));
        Assert.assertEquals(false, palindrome.isPalindrome(1000));
        Assert.assertEquals(true,  palindrome.isPalindrome(2332));
        Assert.assertEquals(false, palindrome.isPalindrome(3332));
        Assert.assertEquals(false, palindrome.isPalindrome(444553444));
        Assert.assertEquals(true,  palindrome.isPalindrome(44455444));
        Assert.assertEquals(false, palindrome.isPalindrome(-1256776521));
        Assert.assertEquals(true,  palindrome.isPalindrome(2147447412));
        Assert.assertEquals(false, palindrome.isPalindrome(Integer.MAX_VALUE));
        Assert.assertEquals(false, palindrome.isPalindrome(Integer.MIN_VALUE));
    }

    //@Test
    public void testMany() throws Exception {
        Palindrome palindrome = new Palindrome();
        Method method = TestUtils.getMethod("leetcode.Palindrome", "isPalindrome");
        for (int i=0; i < 1000000; ++i) {
            method.invoke(palindrome, 234565432);
        }
    }

}
