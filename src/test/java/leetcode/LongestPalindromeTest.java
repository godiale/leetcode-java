package leetcode;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.Matchers.oneOf;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(TimingExtension.class)
class LongestPalindromeTest extends TimingExtension {

    @Test
    void isPalindromeTest() {
        String arena = "ababcabbacba";
        assertThat(LongestPalindrome.isPalindrome(arena, 0, 0), is(true));  // ""
        assertThat(LongestPalindrome.isPalindrome(arena, 1, 2), is(true));  // b
        assertThat(LongestPalindrome.isPalindrome(arena, 6, 8), is(true));  // bb
        assertThat(LongestPalindrome.isPalindrome(arena, 0, 2), is(false)); // ab
        assertThat(LongestPalindrome.isPalindrome(arena, 0, 3), is(true));  // aba
        assertThat(LongestPalindrome.isPalindrome(arena, 2, 5), is(false)); // abc
        assertThat(LongestPalindrome.isPalindrome(arena, 5, 9), is(true));  // abba
        assertThat(LongestPalindrome.isPalindrome(arena, 8, 11), is(false)); // acba
    }

    @Test
    void longestPalindromeTest() {
        var ls = new LongestPalindrome();
        Stream.of(" ", "a", "aba")
                .forEach(s ->
                        IntStream.range(1, 100)
                                .forEach(n -> {
                                    String rs = StringUtils.repeat(s, n);
                                    assertEquals(rs, ls.longestPalindrome(rs));
                                }));
        assertThat(ls.longestPalindrome(""), is(""));
        assertThat(ls.longestPalindrome("a"), is("a"));
        assertThat(ls.longestPalindrome("aa"), is("aa"));
        assertThat(ls.longestPalindrome("ab"), is(oneOf("a", "b")));
        assertThat(ls.longestPalindrome("abc"), is(oneOf("a", "b", "c")));
        assertThat(ls.longestPalindrome("abb"), is("bb"));
        assertThat(ls.longestPalindrome("abcb"), is("bcb"));
        assertThat(ls.longestPalindrome("babad"), is(oneOf("bab", "aba")));
        assertThat(ls.longestPalindrome("cbbd"), is("bb"));
    }


    @Test
    void randomPalindromeTest() {
        LongestPalindrome lp = new LongestPalindrome();
        Random r = new Random();
        IntStream.range(0, 1000)
                .forEach(n -> {
                    StringBuilder b = new StringBuilder();
                    IntStream.range(0, 1000)
                            .forEach(i -> b.append((char)(r.nextInt(26) + 'a')));
                    String p = lp.longestPalindrome(b.toString());
                    assertTrue(LongestPalindrome.isPalindrome(p));
                });
    }
}
