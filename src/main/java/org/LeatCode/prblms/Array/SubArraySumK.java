package org.LeatCode.prblms.Array;

import java.util.HashMap;

public class SubArraySumK {

    //=========================
    //Brute Force approach
    /*
    use 2 for loops and find all posible solutions
    also time complexity is O(n square) as we need 2 loops to find all possible combinations
    * */
    //=========================

    //========================
    //Better Approach
    // approach work for 0 and negatives
    // if array contains negative then this approach is the optimized approach
    //========================
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++){

            sum = sum + nums[i];
            if(hm.containsKey(sum - k)){
                max = Math.max(max,i-hm.get(sum-k));
            }
            hm.put(sum,i);
        }
        return max;
    }

    //========================
    //optimized Approach
    // if array contains +ve then this approach is the optimized approach
    //========================
    public static int optSubarraySum(int[] nums, int k) {
        int fst = 0;
        int snd = fst;
        int sum;
        int max = 0;
        sum = nums[fst];
        while(fst < nums.length){
            while(snd <= fst && sum > k){
                sum -= nums[snd++];
            }
            if(sum == k){
                max = Math.max(max, fst-snd + 1);
            }
            fst++;
            if(fst < nums.length){
                sum += nums[fst];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numb =  {1,2,3,1,1,1,1,3,3};
        //int[] numb =  {1};
        System.out.println(""+subarraySum(numb ,6));
        System.out.println("optimized : "+optSubarraySum(numb , 6));
    }

}
