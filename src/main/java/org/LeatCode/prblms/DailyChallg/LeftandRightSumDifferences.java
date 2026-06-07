package org.LeatCode.prblms.DailyChallg;

import java.util.Arrays;

public class LeftandRightSumDifferences {

    //Leat code Problem
    public static int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]+nums[i-1];
        }
        for (int i = nums.length-2;i>=0;i--){
            right[i] = right[i+1]+nums[i+1];
        }
        for (int i=0;i<nums.length;i++){
            res[i] = Math.abs(left[i]-right[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
