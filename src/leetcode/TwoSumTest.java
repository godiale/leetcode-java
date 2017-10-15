package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test() {
        TwoSum theTwoSum = new TwoSum();
        Assert.assertNull(theTwoSum.twoSum(new int[] {},  0));
        Assert.assertNull(theTwoSum.twoSum(new int[] {1}, 1));
        Assert.assertNull(theTwoSum.twoSum(new int[] {3, 2},    8));
        Assert.assertNull(theTwoSum.twoSum(new int[] {3, 2, 4}, 8));
        Assert.assertArrayEquals(new int[] {0, 1}, theTwoSum.twoSum(new int[] {3, 2},    5));
        Assert.assertArrayEquals(new int[] {0, 1}, theTwoSum.twoSum(new int[] {3, 2, 4}, 5));
        Assert.assertArrayEquals(new int[] {1, 2}, theTwoSum.twoSum(new int[] {3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[] {0, 2}, theTwoSum.twoSum(new int[] {3, 2, 4}, 7));

    }

}
