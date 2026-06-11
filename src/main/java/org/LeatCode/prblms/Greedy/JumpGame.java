package org.LeatCode.prblms.Greedy;

import java.util.Arrays;

public class JumpGame {

    public static boolean canJump(int[] nums) {

        int maxReached = 0;
        for (int i =0;i< nums.length;i++){
            if(maxReached<i){
                return false;
            }
            maxReached = Math.max(maxReached, nums[i]+i);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
