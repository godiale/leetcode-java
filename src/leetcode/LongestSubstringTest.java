package leetcode;

import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class LongestSubstringTest extends TimingExtension {

    @Test
    void longestSubstringTest() {
        LongestSubstring ls = new LongestSubstring();
        Stream.of(" ", "a", "ab", "abc")
                .forEach(s -> {
                    assertEquals(s.length(), ls.lengthOfLongestSubstring(StringUtils.repeat(s, 1)));
                    assertEquals(s.length(), ls.lengthOfLongestSubstring(StringUtils.repeat(s, 2)));
                    assertEquals(s.length(), ls.lengthOfLongestSubstring(StringUtils.repeat(s, 100)));
                });
        assertEquals(3, ls.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, ls.lengthOfLongestSubstring("pwwkew"));
        assertEquals(4, ls.lengthOfLongestSubstring("abcabcdab"));
        assertEquals(5, ls.lengthOfLongestSubstring("abcabcdabe"));
        assertEquals(13, ls.lengthOfLongestSubstring( "abcdefgklmnop"));
    }
}
