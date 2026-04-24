package org.LeatCode.prblms.Math;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumDistancetotheTargetElement {
    /// =======================
    /// optimized approach
    /// in O(n) time complexity and O(1)
    /// =======================
    public static int optGetMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                minDist = Math.min(minDist, Math.abs(i - start));
            }
        }
        return minDist;
    }
    /// ======================
    /// better approach
    /// no need to store all indexes when we can solve it throug one iteration
    /// ======================
    public static int nearest(int ind, ArrayList<Integer> arr){
        System.out.println(ind+"  :  "+arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            min = Math.min(min,Math.abs(ind-arr.get(i)));
        }
        return min;
    }
    public static int getMinDistance(int[] nums, int target, int start) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                hm.put(nums[i],arr);
            }
            else{
                ArrayList<Integer> arr = hm.get(nums[i]);
                arr.add(i);
                hm.put(nums[i],arr);
            }
        }
        return (nearest(start,hm.get(target)));
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1, start = 0;
        System.out.println(getMinDistance(nums,target,start));
    }
}