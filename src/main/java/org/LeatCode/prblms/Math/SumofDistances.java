package org.LeatCode.prblms.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SumofDistances {

    public static int absSum(ArrayList<Integer> arr,int ind){
        int sum = 0;
        for(int i = 0; i<arr.size();i++){
            sum += Math.abs(arr.get(i) - ind);
        }
        return sum;
    }

    public static long[] distance(int[] nums) {
        long[] result = new long[nums.length];
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                hm.put(nums[i],arr);
            }
            else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr = hm.get(nums[i]);
                arr.add(i);
                hm.replace(nums[i],arr);
            }
        }
        for(int i = 0; i<nums.length;i++){

            result[i] = absSum(hm.get(nums[i]),i);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,1,1,2};
        System.out.println(Arrays.toString(distance(nums)));

    }

}
