package org.LeatCode.prblms.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class MnmmabsltDtncBtwnMrrsPrs {

    public static int reverse(int i){
        int rev = 0;

        while (i>0){
            rev = rev*10 + i % 10;
            i = i/10;
        }
        return rev;
    }

    public static int minMirrorPairDistance(int[] nums) {
        int rev;
        int min = Integer.MAX_VALUE;
        HashMap<Integer,Integer> lHashMap = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if(lHashMap.containsKey(nums[i])){
               min = Math.min(min,Math.abs(lHashMap.get(nums[i])-i));
            }
            rev = reverse(nums[i]);

            System.out.println(nums[i]+" : "+rev);
            if(!lHashMap.containsKey(rev)){
                lHashMap.put(rev,i);
            }
            lHashMap.replace(rev,i);
        }
        System.out.println(lHashMap);
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }

    public static void main(String[] args) {

        int[] nums = {12,21,45,33,54};
        int[] nums2 = {1000,100,10,1,100,10,1};
        System.out.println(minMirrorPairDistance(nums2));

    }
}
