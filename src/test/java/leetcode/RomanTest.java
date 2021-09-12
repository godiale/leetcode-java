package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
public class RomanTest {
    private void test(Function<String, Integer> f) {
        assertEquals(1,    f.apply("I"));
        assertEquals(2,    f.apply("II"));
        assertEquals(3,    f.apply("III"));
        assertEquals(4,    f.apply("IV"));
        assertEquals(5,    f.apply("V"));
        assertEquals(6,    f.apply("VI"));
        assertEquals(7,    f.apply("VII"));
        assertEquals(8,    f.apply("VIII"));
        assertEquals(9,    f.apply("IX"));
        assertEquals(10,   f.apply("X"));
        assertEquals(11,   f.apply("XI"));
        assertEquals(12,   f.apply("XII"));
        assertEquals(13,   f.apply("XIII"));
        assertEquals(14,   f.apply("XIV"));
        assertEquals(15,   f.apply("XV"));
        assertEquals(16,   f.apply("XVI"));
        assertEquals(17,   f.apply("XVII"));
        assertEquals(18,   f.apply("XVIII"));
        assertEquals(19,   f.apply("XIX"));
        assertEquals(20,   f.apply("XX"));
        assertEquals(30,   f.apply("XXX"));
        assertEquals(40,   f.apply("XL"));
        assertEquals(50,   f.apply("L"));
        assertEquals(60,   f.apply("LX"));
        assertEquals(70,   f.apply("LXX"));
        assertEquals(80,   f.apply("LXXX"));
        assertEquals(90,   f.apply("XC"));
        assertEquals(100,  f.apply("C"));
        assertEquals(200,  f.apply("CC"));
        assertEquals(300,  f.apply("CCC"));
        assertEquals(400,  f.apply("CD"));
        assertEquals(500,  f.apply("D"));
        assertEquals(600,  f.apply("DC"));
        assertEquals(700,  f.apply("DCC"));
        assertEquals(800,  f.apply("DCCC"));
        assertEquals(900,  f.apply("CM"));
        assertEquals(1000, f.apply("M"));
        assertEquals(39,   f.apply("XXXIX"));
        assertEquals(207,  f.apply("CCVII"));
        assertEquals(246,  f.apply("CCXLVI"));
        assertEquals(1066, f.apply("MLXVI"));
        assertEquals(1776, f.apply("MDCCLXXVI"));
        assertEquals(1954, f.apply("MCMLIV"));
        assertEquals(1990, f.apply("MCMXC"));
        assertEquals(2014, f.apply("MMXIV"));
        assertEquals(3999, f.apply("MMMCMXCIX"));
        assertEquals(4000, f.apply("MMMM"));
    }

    @Test
    public void test_romanToInt() {
        Roman roman = new Roman();
        test(roman::romanToInt);

    }
    @Test
    public void test_romanToInt_Brute() {
        Roman roman = new Roman();
        test(roman::romanToInt_Brute);
    }

    private void testMany(Function<String, Integer> f) {
        for (int i=0; i < 10000000; ++i) {
            f.apply("MDCCLXXVI");
        }
    }

    @Test
    public void testMany_romanToInt() {
        Roman roman = new Roman();
        testMany(roman::romanToInt);
    }

    @Test
    public void testMany_romanToInt_Brute() {
        Roman roman = new Roman();
        testMany(roman::romanToInt_Brute);
    }
}
