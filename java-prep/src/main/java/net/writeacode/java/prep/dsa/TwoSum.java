package net.writeacode.java.prep.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    // input nums = [2,7,11,15], target 9
    // output [0,1]
    public List<Integer> twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return Arrays.asList(map.get(complement), i);
            }
            map.put(nums[i], i);
        }
        return List.of();
    }
}
