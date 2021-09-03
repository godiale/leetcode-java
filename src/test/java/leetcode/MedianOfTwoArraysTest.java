package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(TimingExtension.class)
class MedianOfTwoArraysTest {

    private static MedianOfTwoArrays medianSearch;

    @BeforeAll
    private static void setUp() {
        medianSearch = new MedianOfTwoArrays();
    }

    private double medianBruteForce(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            throw new IllegalArgumentException("Both arrays are empty");
        }
        final List<Integer> mergedNums = new ArrayList<>();
        Stream.of(nums1, nums2)
                .forEach(nums -> Arrays.stream(nums).boxed().forEach(mergedNums::add));
        mergedNums.sort(Integer::compareTo);
        return medianSearch.findMedian(mergedNums.stream().mapToInt(i->i).toArray());
    }

    @Test
    void testMedianOneArray() {
        assertThrows(IllegalArgumentException.class, () -> medianSearch.findMedian(new int[]{}));
        assertEquals(1.0, medianSearch.findMedian(new int[]{1}));
        assertEquals(3.0, medianSearch.findMedian(new int[]{1, 2, 3, 4, 5}));
        assertEquals(3.5, medianSearch.findMedian(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void testMedianBruteForce() {
        assertThrows(IllegalArgumentException.class, () -> medianBruteForce(new int[]{}, new int[]{}));
        assertEquals(1.0, medianBruteForce(new int[]{1}, new int[]{}));
        assertEquals(1.5, medianBruteForce(new int[]{1}, new int[]{2}));
        assertEquals(4.5, medianBruteForce(new int[]{1, 2, 3, 4, 5}, new int[]{6, 8, 9}));
        assertEquals(6.0, medianBruteForce(new int[]{1, 3, 6, 7, 9}, new int[]{3, 8}));
    }

    private void performTest(int[] nums1, int[] nums2) {
        assertEquals(medianBruteForce(nums1, nums2), medianSearch.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void testMedianSortedArrays() {
        performTest(new int[]{1}, new int[]{});
        performTest(new int[]{}, new int[]{1});
        performTest(new int[]{}, new int[]{1, 2});
        performTest(new int[]{1, 2}, new int[]{});
        performTest(new int[]{1, 2}, new int[]{3});
        performTest(new int[]{1, 2}, new int[]{3, 4});
        performTest(new int[]{1, 4}, new int[]{2, 3});
        performTest(new int[]{1, 2, 3}, new int[]{6, 8});
        performTest(new int[]{1, 6, 8}, new int[]{2, 3});
        performTest(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8});
        performTest(new int[]{1, 4, 5, 6, 8}, new int[]{2, 3, 7});

        Random randomGenerator = new Random(0);
        Function<Integer, int[]> arrayGenerator = n ->
                randomGenerator.ints(0, 20).limit(n).sorted().toArray();

        for (int i=1; i < 100; ++i) {
            final int[] nums1 = arrayGenerator.apply(i);
            for (int j = 1; j < 100; ++j) {
                final int[] nums2 = arrayGenerator.apply(j);
                performTest(nums1, nums2);
            }
        }
    }
}
