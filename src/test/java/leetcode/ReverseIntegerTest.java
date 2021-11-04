package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
public class ReverseIntegerTest {

    @Test
    public void test() {
        ReverseInteger ri = new ReverseInteger();
        assertEquals(0,    ri.reverse(+0));
        assertEquals(321,  ri.reverse(+123));
        assertEquals(12,   ri.reverse(+210));
        assertEquals(-653, ri.reverse(-356));
        assertEquals(9998, ri.reverse(+8999));
        assertEquals(0,    ri.reverse(+2088888888));
        assertEquals(0,    ri.reverse(-2099999999));
        assertEquals(0,    ri.reverse(Integer.MAX_VALUE));
        assertEquals(0,    ri.reverse(Integer.MIN_VALUE));
    }

    @Test
    public void testMany() {
        ReverseInteger ri = new ReverseInteger();
        for (int i=0; i < 1000000; ++i) {
            ri.reverse(-1234567891);
        }
    }
}
