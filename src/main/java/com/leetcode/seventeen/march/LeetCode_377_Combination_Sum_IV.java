package com.leetcode.seventeen.march;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fisher on 3/12/2017.
 */
public class LeetCode_377_Combination_Sum_IV {

    public static void main(String[] args) {
        int target = 32;
        int[] nums = {1, 2, 3};

        System.out.println(combinationSum4(nums, target));
    }


    // solution got online  -- can be further optimized to DP, but this solution is good enough to pass
    // comb[target] = sum(comb[target - nums[i]]), where 0 <= i < nums.length, and target >= nums[i]
    static Map<Integer, Integer> memo = new HashMap<>();

    public static int combinationSum4(int[] nums, int target) {

        if (target == 0) {
            return 1;
        } else if (target < 0) {
            return 0;
        }

        if (memo.containsKey((target))) {
            return memo.get(target);
        } else {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                count += combinationSum4(nums, target - nums[i]);
            }

            //memorization
            memo.put(target, count);
            return count;
        }

    }


    // first idea is to use dfs -- whenever I see permunation or combination, dfs will be the first one come to mind
    // TLE - because, there are relationships between target and target-nums[i], so duplicate calculation existing
//    static int count = 0;
//
//    public static int combinationSum4(int[] nums, int target) {
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//
//                dfs(nums, target - nums[i]);
//        }
//        return count;
//    }
//
//
//    public static void dfs(int[] nums, int target) {
//
//        if (target == 0) {
//            count++;
//            return;
//        }
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            if(target-nums[i]<0){
//                // no need to continue
//                return;
//            } else{
//                dfs(nums, target - nums[i]);
//            }
//
//        }
//
//    }


}
