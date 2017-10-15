package leetcode;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

public class TwoSumTest {

    public void test(String methodName) {
        try {
            TwoSum theTwoSum = new TwoSum();
            Class<?> c = Class.forName("leetcode.TwoSum");
            Method method = Arrays.asList(c.getDeclaredMethods())
                    .stream().filter(m -> m.getName().equals(methodName)).findAny().orElse(null);
            Assert.assertNull(method.invoke(theTwoSum, new int[] {},  0));
            Assert.assertNull(method.invoke(theTwoSum, new int[] {1}, 1));
            Assert.assertNull(method.invoke(theTwoSum, new int[] {3, 2},    8));
            Assert.assertNull(method.invoke(theTwoSum, new int[] {3, 2, 1}, 8));
            Assert.assertArrayEquals(new int[] {0, 1},
                    (int[])method.invoke(theTwoSum, new int[] {3, 2}, 5));
            Assert.assertArrayEquals(new int[] {0, 1},
                    (int[])method.invoke(theTwoSum, new int[] {3, 2, 4}, 5));
            Assert.assertArrayEquals(new int[] {1, 2},
                    (int[])method.invoke(theTwoSum, new int[] {3, 2, 4}, 6));
            Assert.assertArrayEquals(new int[] {0, 2},
                    (int[])method.invoke(theTwoSum, new int[] {3, 2, 4}, 7));
            Assert.assertArrayEquals(new int[] {998, 999},
                    (int[])method.invoke(theTwoSum, IntStream.rangeClosed(1, 1000).toArray(), 1999));
        } catch (Exception e) {
            Assert.assertTrue(e.toString(), false);
        }
    }

    @Rule
    public final Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void succeeded(long nanos, Description description) {
            System.out.println(description.getMethodName() +
                    " succeeded, time taken (milliseconds) " + nanos / 1000000.0);
        }
    };

    @Test
    public void test_bruteForce() {
        testMany("twoSum_BruteForce");
    }

    @Test
    public void test_HashMap_2pass() {
        testMany("twoSum_HashMap_2pass");
    }

    public void testMany(String methodName) {
        IntStream.rangeClosed(1, 100000).forEach($ -> test(methodName));
    }
}
