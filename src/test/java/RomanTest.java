package leetcode;

import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

public class RomanTest extends Timeit {

    @Test
    public void test() {
        Roman roman = new Roman();
        Assert.assertEquals(1,    roman.romanToInt("I"));
        Assert.assertEquals(2,    roman.romanToInt("II"));
        Assert.assertEquals(3,    roman.romanToInt("III"));
        Assert.assertEquals(4,    roman.romanToInt("IV"));
        Assert.assertEquals(5,    roman.romanToInt("V"));
        Assert.assertEquals(6,    roman.romanToInt("VI"));
        Assert.assertEquals(7,    roman.romanToInt("VII"));
        Assert.assertEquals(8,    roman.romanToInt("VIII"));
        Assert.assertEquals(9,    roman.romanToInt("IX"));
        Assert.assertEquals(10,   roman.romanToInt("X"));
        Assert.assertEquals(11,   roman.romanToInt("XI"));
        Assert.assertEquals(12,   roman.romanToInt("XII"));
        Assert.assertEquals(13,   roman.romanToInt("XIII"));
        Assert.assertEquals(14,   roman.romanToInt("XIV"));
        Assert.assertEquals(15,   roman.romanToInt("XV"));
        Assert.assertEquals(16,   roman.romanToInt("XVI"));
        Assert.assertEquals(17,   roman.romanToInt("XVII"));
        Assert.assertEquals(18,   roman.romanToInt("XVIII"));
        Assert.assertEquals(19,   roman.romanToInt("XIX"));
        Assert.assertEquals(20,   roman.romanToInt("XX"));
        Assert.assertEquals(30,   roman.romanToInt("XXX"));
        Assert.assertEquals(40,   roman.romanToInt("XL"));
        Assert.assertEquals(50,   roman.romanToInt("L"));
        Assert.assertEquals(60,   roman.romanToInt("LX"));
        Assert.assertEquals(70,   roman.romanToInt("LXX"));
        Assert.assertEquals(80,   roman.romanToInt("LXXX"));
        Assert.assertEquals(90,   roman.romanToInt("XC"));
        Assert.assertEquals(100,  roman.romanToInt("C"));
        Assert.assertEquals(200,  roman.romanToInt("CC"));
        Assert.assertEquals(300,  roman.romanToInt("CCC"));
        Assert.assertEquals(400,  roman.romanToInt("CD"));
        Assert.assertEquals(500,  roman.romanToInt("D"));
        Assert.assertEquals(600,  roman.romanToInt("DC"));
        Assert.assertEquals(700,  roman.romanToInt("DCC"));
        Assert.assertEquals(800,  roman.romanToInt("DCCC"));
        Assert.assertEquals(900,  roman.romanToInt("CM"));
        Assert.assertEquals(1000, roman.romanToInt("M"));
        Assert.assertEquals(39,   roman.romanToInt("XXXIX"));
        Assert.assertEquals(207,  roman.romanToInt("CCVII"));
        Assert.assertEquals(246,  roman.romanToInt("CCXLVI"));
        Assert.assertEquals(1066, roman.romanToInt("MLXVI"));
        Assert.assertEquals(1776, roman.romanToInt("MDCCLXXVI"));
        Assert.assertEquals(1954, roman.romanToInt("MCMLIV"));
        Assert.assertEquals(1990, roman.romanToInt("MCMXC"));
        Assert.assertEquals(2014, roman.romanToInt("MMXIV"));
        Assert.assertEquals(3999, roman.romanToInt("MMMCMXCIX"));
        Assert.assertEquals(4000, roman.romanToInt("MMMM"));
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
