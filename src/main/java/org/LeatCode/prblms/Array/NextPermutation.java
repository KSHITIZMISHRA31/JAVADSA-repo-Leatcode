package org.LeatCode.prblms.Array;

import java.util.Arrays;

public class NextPermutation {

    //====================
    //Optimized Approach
    // in this first we have find that dipping index where values is smaller
    // then we replace the value with the bigger value whith it
    // then sort the remainig arrray
    //===================

    public static void nextPermutation(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int numlen = nums.length;
        int ind = -1;
        for(int i = numlen-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        System.out.println(ind);
        // Edge case handling
        if(ind == -1){
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
        }


        for(int i = numlen-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums,ind+1,numlen);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
//        int[] nums = {2,1,5,4,3,0,0};
        int[] nums = {1,2,3};

//        int[] nums = {5,4,3,3,2,1,0,0};
        nextPermutation(nums);
    }
}


