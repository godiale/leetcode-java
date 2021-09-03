package leetcode;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
public class RomanTest {

    @Test
    public void test() {
        Roman roman = new Roman();
        assertEquals(1,    roman.romanToInt("I"));
        assertEquals(2,    roman.romanToInt("II"));
        assertEquals(3,    roman.romanToInt("III"));
        assertEquals(4,    roman.romanToInt("IV"));
        assertEquals(5,    roman.romanToInt("V"));
        assertEquals(6,    roman.romanToInt("VI"));
        assertEquals(7,    roman.romanToInt("VII"));
        assertEquals(8,    roman.romanToInt("VIII"));
        assertEquals(9,    roman.romanToInt("IX"));
        assertEquals(10,   roman.romanToInt("X"));
        assertEquals(11,   roman.romanToInt("XI"));
        assertEquals(12,   roman.romanToInt("XII"));
        assertEquals(13,   roman.romanToInt("XIII"));
        assertEquals(14,   roman.romanToInt("XIV"));
        assertEquals(15,   roman.romanToInt("XV"));
        assertEquals(16,   roman.romanToInt("XVI"));
        assertEquals(17,   roman.romanToInt("XVII"));
        assertEquals(18,   roman.romanToInt("XVIII"));
        assertEquals(19,   roman.romanToInt("XIX"));
        assertEquals(20,   roman.romanToInt("XX"));
        assertEquals(30,   roman.romanToInt("XXX"));
        assertEquals(40,   roman.romanToInt("XL"));
        assertEquals(50,   roman.romanToInt("L"));
        assertEquals(60,   roman.romanToInt("LX"));
        assertEquals(70,   roman.romanToInt("LXX"));
        assertEquals(80,   roman.romanToInt("LXXX"));
        assertEquals(90,   roman.romanToInt("XC"));
        assertEquals(100,  roman.romanToInt("C"));
        assertEquals(200,  roman.romanToInt("CC"));
        assertEquals(300,  roman.romanToInt("CCC"));
        assertEquals(400,  roman.romanToInt("CD"));
        assertEquals(500,  roman.romanToInt("D"));
        assertEquals(600,  roman.romanToInt("DC"));
        assertEquals(700,  roman.romanToInt("DCC"));
        assertEquals(800,  roman.romanToInt("DCCC"));
        assertEquals(900,  roman.romanToInt("CM"));
        assertEquals(1000, roman.romanToInt("M"));
        assertEquals(39,   roman.romanToInt("XXXIX"));
        assertEquals(207,  roman.romanToInt("CCVII"));
        assertEquals(246,  roman.romanToInt("CCXLVI"));
        assertEquals(1066, roman.romanToInt("MLXVI"));
        assertEquals(1776, roman.romanToInt("MDCCLXXVI"));
        assertEquals(1954, roman.romanToInt("MCMLIV"));
        assertEquals(1990, roman.romanToInt("MCMXC"));
        assertEquals(2014, roman.romanToInt("MMXIV"));
        assertEquals(3999, roman.romanToInt("MMMCMXCIX"));
        assertEquals(4000, roman.romanToInt("MMMM"));
    }

    @Test
    public void testMany() throws Exception {
        Roman roman = new Roman();
        Method method = TestUtils.getMethod("leetcode.Roman", "romanToInt");
        for (int i=0; i < 1000000; ++i) {
            method.invoke(roman, "MDCCLXXVI");
        }
    }
}
