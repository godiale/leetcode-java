package leetcode;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
public class ReverseIntegerTest {

    @Test
    public void test() {
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(0,    reverseInteger.reverse(+0));
        assertEquals(321,  reverseInteger.reverse(+123));
        assertEquals(12,   reverseInteger.reverse(+210));
        assertEquals(-653, reverseInteger.reverse(-356));
        assertEquals(9998, reverseInteger.reverse(+8999));
        assertEquals(0,    reverseInteger.reverse(+2088888888));
        assertEquals(0,    reverseInteger.reverse(-2099999999));
        assertEquals(0,    reverseInteger.reverse(Integer.MAX_VALUE));
        assertEquals(0,    reverseInteger.reverse(Integer.MIN_VALUE));
    }

    @Test
    public void testMany() throws Exception {
        ReverseInteger reverseInteger = new ReverseInteger();
        Method method = TestUtils.getMethod("leetcode.ReverseInteger", "reverse");
        for (int i=0; i < 1000000; ++i) {
            method.invoke(reverseInteger, -1234567891);
        }
    }
}
