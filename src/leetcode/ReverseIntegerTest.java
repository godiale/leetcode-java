package leetcode;

import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest extends Timeit {

    @Test
    public void test() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(0,    reverseInteger.reverse(+0));
        Assert.assertEquals(321,  reverseInteger.reverse(+123));
        Assert.assertEquals(12,   reverseInteger.reverse(+210));
        Assert.assertEquals(-653, reverseInteger.reverse(-356));
        Assert.assertEquals(9998, reverseInteger.reverse(+8999));
        Assert.assertEquals(0,    reverseInteger.reverse(+2088888888));
        Assert.assertEquals(0,    reverseInteger.reverse(-2099999999));
        Assert.assertEquals(0,    reverseInteger.reverse(Integer.MAX_VALUE));
        Assert.assertEquals(0,    reverseInteger.reverse(Integer.MIN_VALUE));
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
