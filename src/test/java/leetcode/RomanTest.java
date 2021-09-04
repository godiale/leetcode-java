package leetcode;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
public class RomanTest {

    @ParameterizedTest(name = "#{index} - Run test for method {0}")
    @ValueSource(strings = {"romanToInt", "romanToInt_Brute"})
    public void test(String methodName) throws Exception {
        Roman roman = new Roman();
        Method method = TestUtils.getMethod("leetcode.Roman", methodName);
        assertEquals(1,    method.invoke(roman, "I"));
        assertEquals(2,    method.invoke(roman, "II"));
        assertEquals(3,    method.invoke(roman, "III"));
        assertEquals(4,    method.invoke(roman, "IV"));
        assertEquals(5,    method.invoke(roman, "V"));
        assertEquals(6,    method.invoke(roman, "VI"));
        assertEquals(7,    method.invoke(roman, "VII"));
        assertEquals(8,    method.invoke(roman, "VIII"));
        assertEquals(9,    method.invoke(roman, "IX"));
        assertEquals(10,   method.invoke(roman, "X"));
        assertEquals(11,   method.invoke(roman, "XI"));
        assertEquals(12,   method.invoke(roman, "XII"));
        assertEquals(13,   method.invoke(roman, "XIII"));
        assertEquals(14,   method.invoke(roman, "XIV"));
        assertEquals(15,   method.invoke(roman, "XV"));
        assertEquals(16,   method.invoke(roman, "XVI"));
        assertEquals(17,   method.invoke(roman, "XVII"));
        assertEquals(18,   method.invoke(roman, "XVIII"));
        assertEquals(19,   method.invoke(roman, "XIX"));
        assertEquals(20,   method.invoke(roman, "XX"));
        assertEquals(30,   method.invoke(roman, "XXX"));
        assertEquals(40,   method.invoke(roman, "XL"));
        assertEquals(50,   method.invoke(roman, "L"));
        assertEquals(60,   method.invoke(roman, "LX"));
        assertEquals(70,   method.invoke(roman, "LXX"));
        assertEquals(80,   method.invoke(roman, "LXXX"));
        assertEquals(90,   method.invoke(roman, "XC"));
        assertEquals(100,  method.invoke(roman, "C"));
        assertEquals(200,  method.invoke(roman, "CC"));
        assertEquals(300,  method.invoke(roman, "CCC"));
        assertEquals(400,  method.invoke(roman, "CD"));
        assertEquals(500,  method.invoke(roman, "D"));
        assertEquals(600,  method.invoke(roman, "DC"));
        assertEquals(700,  method.invoke(roman, "DCC"));
        assertEquals(800,  method.invoke(roman, "DCCC"));
        assertEquals(900,  method.invoke(roman, "CM"));
        assertEquals(1000, method.invoke(roman, "M"));
        assertEquals(39,   method.invoke(roman, "XXXIX"));
        assertEquals(207,  method.invoke(roman, "CCVII"));
        assertEquals(246,  method.invoke(roman, "CCXLVI"));
        assertEquals(1066, method.invoke(roman, "MLXVI"));
        assertEquals(1776, method.invoke(roman, "MDCCLXXVI"));
        assertEquals(1954, method.invoke(roman, "MCMLIV"));
        assertEquals(1990, method.invoke(roman, "MCMXC"));
        assertEquals(2014, method.invoke(roman, "MMXIV"));
        assertEquals(3999, method.invoke(roman, "MMMCMXCIX"));
        assertEquals(4000, method.invoke(roman, "MMMM"));
    }

    @ParameterizedTest(name = "#{index} - Run test for method {0}")
    @ValueSource(strings = {"romanToInt", "romanToInt_Brute"})
    public void testMany(String methodName) throws Exception {
        Roman roman = new Roman();
        Method method = TestUtils.getMethod("leetcode.Roman", methodName);
        for (int i=0; i < 1000000; ++i) {
            method.invoke(roman, "MDCCLXXVI");
        }
    }
}
