package org.LeatCode.prblms.Array;

import java.util.*;

public class Sum3 {

    //===================
    //Brute force
    //In this approach we will use three for loops and find all possible pairs that make overall sum eqals to zero
    // that approach has time complexity of ncube and which was very expensive
    //===================

    //==================
    //Better approach
    //In this aproach we use 2 for loops and for thired value we will use set to store a nuber and check
    // if it is comming then it take only o(nlogn) to find in map and cost as over all complexity on O(nsquare)
    //=================
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> lHashset = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            HashSet<Integer> sumCheck = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                List<Integer> pair = new ArrayList<>();
                if(sumCheck.contains(-(nums[i]+nums[j]))){
                    pair.add(nums[i]);
                    pair.add(nums[j]);
                    pair.add(-(nums[i]+nums[j]));
                    pair.sort(Comparator.naturalOrder());
                    lHashset.add(pair);
                }
                sumCheck.add(nums[j]);
            }
        }
        List<List<Integer>> lListInteger = new ArrayList<>(lHashset);
        return lListInteger;
    }

    //=====================
    //Optimized Approach
    //Sort + Fix one element + Two-pointer scan + Skip duplicates
    //=====================
    public static List<List<Integer>> optimizedThreeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> lListInteger = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[j]);
                    pair.add(nums[k]);
                    lListInteger.add(pair);
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j-1]) j++;
                    while (j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return lListInteger;
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
        System.out.println(optimizedThreeSum(nums));

    }
}
