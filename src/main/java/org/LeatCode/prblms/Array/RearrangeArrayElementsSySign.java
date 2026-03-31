package org.LeatCode.prblms.Array;

import java.util.Arrays;

public class RearrangeArrayElementsSySign {

    //=========================
    //Brute force approach
    //=========================
    public static int[] rearrangeArray(int[] nums) {
        int[] parr = new int[nums.length/2];
        int[] narr = new int[nums.length/2];
        int p = 0;
        int n = 0;
        System.out.println(Arrays.toString(parr)+" : "+Arrays.toString(narr));
        for(int i=0;i< nums.length;i++){
            if(nums[i] < 0){
                narr[n++] = nums[i];
            }
            else{
                parr[p++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(parr)+" : "+Arrays.toString(narr));
        p =0;
        while(p<n){
            nums[p*2] = parr[p];
            nums[p*2+1] = narr[p];
            p++;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    //========================
    //Optimized aproach
    // trying it in single loop
    //========================
    public static int[] betterRearrangeArray(int[] nums) {
        int[] parr = new int[nums.length];
        int p = 0;
        int n = 1;
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(nums[i]<0){
                parr[p] = nums[i];
                p = p+2;
            }
            else{
                parr[n] = nums[i];
                n = n+2;
            }
        }
        return parr;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(betterRearrangeArray(nums));
        System.out.println(rearrangeArray(nums));

    }
}
