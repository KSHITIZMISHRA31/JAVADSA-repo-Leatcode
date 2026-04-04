package org.LeatCode.prblms.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SubarraySumEqualsK {

    //=========================
    //Brute Force approach
    /*
    use 2 for loops and find all posible solutions
    also time complexity is O(n square) as we need 2 loops to find all possible combinations
    * */
    //=========================

    //=========================
    //Optimized Approach
    //concept of prefix sum
    //In this we will calculate the sum and start inserting into a hash map before that first check if
    //it contains presum-k in map then add its count other wise insert its presum value in hashmap
    //=========================

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int preSum = 0;
        Map<Integer,Integer> lMap = new HashMap<>();
        lMap.put(preSum,1);
        for(int i = 0; i< nums.length ; i++){
            preSum = preSum + nums[i];
            if(lMap.containsKey(preSum-k)){
                count = count + lMap.get(preSum-k);
            }
            if(!lMap.containsKey(preSum)){
                lMap.put(preSum,1);
            }
            else{
                lMap.replace(preSum, lMap.get(preSum)+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        System.out.println(subarraySum(nums,k));
    }
}
