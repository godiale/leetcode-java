package leetcode;

import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

public class TwoSumTest {

    @Test
    public void test() {
        TwoSum theTwoSum = new TwoSum();
        Assert.assertNull(theTwoSum.twoSum(new int[] {},  0));
        Assert.assertNull(theTwoSum.twoSum(new int[] {1}, 1));
        Assert.assertNull(theTwoSum.twoSum(new int[] {3, 2},    8));
        Assert.assertNull(theTwoSum.twoSum(new int[] {3, 2, 4}, 8));
        Assert.assertArrayEquals(new int[] {0, 1},
                theTwoSum.twoSum(new int[] {3, 2},    5));
        Assert.assertArrayEquals(new int[] {0, 1},
                theTwoSum.twoSum(new int[] {3, 2, 4}, 5));
        Assert.assertArrayEquals(new int[] {1, 2},
                theTwoSum.twoSum(new int[] {3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[] {0, 2},
                theTwoSum.twoSum(new int[] {3, 2, 4}, 7));
        Assert.assertArrayEquals(new int[] {998, 999},
                theTwoSum.twoSum(IntStream.rangeClosed(1, 1000).toArray(), 1999));
    }

    @Rule
    public final Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void succeeded(long nanos, Description description) {
            System.out.println(description.getMethodName() +
                    " succeeded, time taken (milliseconds) " + nanos / 1000000.0);
        }
    };

    //@Test
    public void testMany() {
        IntStream.rangeClosed(1, 1000).forEach($ -> test());
    }
}
