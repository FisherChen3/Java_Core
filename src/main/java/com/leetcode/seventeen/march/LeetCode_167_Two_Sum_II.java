package com.leetcode.seventeen.march;

/**
 * Created by Fisher on 3/5/2017.
 */
// first idea is to use hashmap <int value, idx> to solve this problem, but ascending order -- this condition is not used
// in order to use ascending order, binary search must be used to achieve logN time complexity
// but it turns out there is no way for logN
// try to solve without hashmap to save space complexity
public class LeetCode_167_Two_Sum_II {

    // two pointer -- O(N)
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1;

        int [] res = new int[2];

        while(p1<p2){
            int num1 = numbers[p1];
            int num2 = numbers[p2];
            int sum = num1 + num2;
            if(sum==target){
                res[0] = p1+1;
                res[1] = p2+1;
                return res;
            } else if(sum>target){
                p2--;
            } else{
                p1++;
            }
        }
        return res;
    }

}
