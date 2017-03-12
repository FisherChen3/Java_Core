package com.leetcode.seventeen.march;

/**
 * Created by Fisher on 3/11/2017.
 */
public class LeetCode_376_Wiggle_Subsequence {

    public static void main(String[] args) {
//        int[] nums = {1,7,4,9,2,5};
//        int[] nums = {1,4,7,2,5};
//        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(wiggleMaxLength(nums));
    }

    public static int wiggleMaxLength(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Boolean ace = null;
        int prev = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){
                continue;
            } else if(nums[i]>prev){
                if(ace==null){
                    ace = true;
                    count++;
                } else if(ace.equals(false)){
                    ace=true;
                    count++;
                }
                prev = nums[i];
            } else {
                if(ace==null){
                    ace = false;
                    count++;
                } else if(ace.equals(true)){
                    ace = false;
                    count++;
                }
                prev = nums[i];
            }
        }
        return count;
    }

}
