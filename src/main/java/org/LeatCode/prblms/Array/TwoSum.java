package org.LeatCode.prblms.Array;

import java.util.*;

public class TwoSum {

    //========================
    //Brute force approach
    //========================
    /*
    use for loop and check if elemnt is presnt
    but thats time complexithy is O(nsqu)
     */

    //=========================
    // Optimized Aproach
    //=========================

    public static int[] optTwoSum(int[] nums, int target) {
        int rem = 0;
        int[] arr = new int[2];
        Map<Integer,Integer> mapval = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            rem = target - nums[i];
            if(mapval.containsKey(rem)){
                arr[0] = i ;
                arr[1] = mapval.get(rem);
                return arr;
            }
            else{
                mapval.put(nums[i],i);
            }
        }
        return(arr);
    }

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int[] rs = optTwoSum(nums,9);
        System.out.println(Arrays.toString(rs));

    }
}
