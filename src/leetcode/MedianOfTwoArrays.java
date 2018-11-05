package leetcode;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

class MedianOfTwoArrays {

    double findMedian(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        if (nums.length % 2 == 0) {
            final int medianIndexLow = nums.length / 2;
            return (nums[medianIndexLow-1] + nums[medianIndexLow]) / 2.0;
        } else {
            final int medianIndex = (nums.length - 1) / 2;
            return nums[medianIndex];
        }
    }

    private double findMedian2(double a, double b) {
        return (a + b) / 2.0;
    }

    private double findMedian3(long a, long b, long c) {
        return (double)a + b + c - max(a, max(b, c))
                                 - min(a, min(b, c));
    }

    private double findMedian4(long a, long b, long c, long d) {
        final long Max = max(a, max(b, max(c, d)));
        final long Min = min(a, min(b, min(c, d)));
        return (a + b + c + d - Max - Min) / 2.0;
    }

    private double findMedianSortedArraysOrdered(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return findMedian(nums2);
        }
        else if (nums1.length == 1) {
            if (nums2.length == 1) {
                return findMedian2(nums1[0], nums2[0]);
            }
            else if (nums2.length % 2 != 0) {
                return findMedian2(nums2[nums2.length / 2],
                                   findMedian3(nums1[0],
                                               nums2[nums2.length / 2 - 1],
                                               nums2[nums2.length / 2 + 1]));
            }
            else {
                return findMedian3(nums2[nums2.length / 2],
                                   nums2[nums2.length / 2 - 1],
                                   nums1[0]);
            }
        }
        else if (nums1.length == 2) {
            if (nums2.length == 2) {
                return findMedian4(nums1[0], nums1[1], nums2[0], nums2[1]);
            }
            else if (nums2.length % 2 != 0) {
                return findMedian3(nums2[nums2.length / 2],
                                   max(nums1[0], nums2[nums2.length / 2 - 1]),
                                   min(nums1[1], nums2[nums2.length / 2 + 1]));
            } else {
                return findMedian4(nums2[nums2.length / 2],
                                   nums2[nums2.length / 2 - 1],
                                   max(nums1[0], nums2[nums2.length / 2 - 2]),
                                   min(nums1[1], nums2[nums2.length / 2 + 1]));
            }
        } else {
            final int idx1 = (nums1.length - 1) / 2;
            final int idx2 = (nums2.length - 1) / 2;

            if (nums1[idx1] <= nums2[idx2]) {
                return findMedianSortedArraysOrdered(Arrays.copyOfRange(nums1, idx1, nums1.length),
                                                     Arrays.copyOfRange(nums2, 0, nums2.length - idx1));
            } else {
                return findMedianSortedArraysOrdered(Arrays.copyOfRange(nums1, 0, nums1.length / 2 + 1),
                                                     Arrays.copyOfRange(nums2, idx1, nums2.length));
            }
        }
    }

    double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            throw new IllegalArgumentException("Both arrays are empty");
        }
        if (nums1.length > nums2.length) {
            return findMedianSortedArraysOrdered(nums2, nums1);
        }
        else {
            return findMedianSortedArraysOrdered(nums1, nums2);
        }
    }
}
