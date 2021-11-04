package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    @SuppressWarnings("unused")
    public int[] twoSum_BruteForce(int[] nums, int target) {
        for (int i=0; i < nums.length-1; ++i) {
            for (int j=i+1; j < nums.length; ++j) {
                if (nums[i]+nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    @SuppressWarnings("unused")
    public int[] twoSum_HashMap_2pass(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i=0; i < nums.length; ++i) {
            index.put(nums[i], i);
        }
        for (int i=0; i < nums.length; ++i) {
            int delta = target - nums[i];
            if (index.containsKey(delta)) {
                int j = index.get(delta);
                if (i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
