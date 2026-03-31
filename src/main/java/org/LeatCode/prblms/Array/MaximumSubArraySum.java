package org.LeatCode.prblms.Array;

import java.util.Arrays;

public class MaximumSubArraySum {

    //=========================
    //Brute force Approach
    //find all sub arrays and find the maximum sum  O(n^2)   TLE
    //=========================
    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int eachitrsum;
        for(int i=0 ; i<nums.length ; i++){
            eachitrsum = 0;
            for(int j = i ; j< nums.length ; j++) {
                eachitrsum += nums[j];
                if (eachitrsum > maxsum) {
                    maxsum = eachitrsum;
                }
            }
        }
        return maxsum;
    }

    //=========================
    //Optimized Approach
    //Kadanes Algorithm
    //=========================
    public static int optMaxSubArray(int[] nums) {
        int maxval = Integer.MIN_VALUE;
        int sum = 0;
        for(int i: nums){
            sum = sum + i;
            maxval = Math.max(maxval,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxval;
    }

    //=========================
    //Optimized Approach
    //Kadanes Algorithm  (Interviewr asked to print the maximum sub array)
    //=========================
    public static int optMaxSubArrayPrint(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int maxval = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        int arrstart=0;
        for(int i=0;i<nums.length;i++){
            if(sum == 0){
                start = i;
            }
            sum = sum + nums[i];
            if(maxval < sum){
                maxval = sum;
                arrstart = start;
                end = i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("Sub Array "+arrstart+" : "+end);
        System.out.print("[");
        for(int i = arrstart;i<=end;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        return maxval;
    }



    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        System.out.println(optMaxSubArray(nums));
        System.out.println(optMaxSubArrayPrint(nums));
    }
}
