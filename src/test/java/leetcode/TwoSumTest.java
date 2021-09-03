package leetcode;

import java.lang.reflect.Method;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(TimingExtension.class)
public class TwoSumTest {

    public void test(String methodName) throws Exception {
        TwoSum theTwoSum = new TwoSum();
        Method method = TestUtils.getMethod("leetcode.TwoSum", methodName);
        method.invoke(theTwoSum, new int[] {},  0);
        assertNull(method.invoke(theTwoSum, new int[] {},  0));
        assertNull(method.invoke(theTwoSum, new int[] {1}, 1));
        assertNull(method.invoke(theTwoSum, new int[] {3, 2},    8));
        assertNull(method.invoke(theTwoSum, new int[] {3, 2, 1}, 8));
        assertArrayEquals(new int[] {0, 1},
                (int[])method.invoke(theTwoSum, new int[] {3, 2}, 5));
        assertArrayEquals(new int[] {0, 1},
                (int[])method.invoke(theTwoSum, new int[] {3, 2, 4}, 5));
        assertArrayEquals(new int[] {1, 2},
                (int[])method.invoke(theTwoSum, new int[] {3, 2, 4}, 6));
        assertArrayEquals(new int[] {0, 2},
                (int[])method.invoke(theTwoSum, new int[] {3, 2, 4}, 7));
        assertArrayEquals(new int[] {998, 999},
                (int[])method.invoke(theTwoSum, IntStream.rangeClosed(1, 1000).toArray(), 1999));
    }

    @Test
    public void test_bruteForce() throws Exception {
        test("twoSum_BruteForce");
    }

    @Test
    public void test_HashMap_2pass() throws Exception {
        test("twoSum_HashMap_2pass");
    }

    public void testMany(String methodName) throws Exception {
        TwoSum theTwoSum = new TwoSum();
        Method method = TestUtils.getMethod("leetcode.TwoSum", methodName);
        for (int i=0; i < 10000; ++i) {
            method.invoke(theTwoSum, IntStream.rangeClosed(1, 1000).toArray(), 1999);
        }
    }

    @Test
    public void testMany_bruteForce() throws Exception {
        testMany("twoSum_BruteForce");
    }

    @Test
    public void testMany_HashMap_2pass() throws Exception {
        testMany("twoSum_HashMap_2pass");
    }
}
