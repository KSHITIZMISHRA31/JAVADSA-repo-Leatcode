package org.LeatCode.prblms.Array;

import java.util.Arrays;

public class SortArray012 {

    //===================
    //Brute force approach
    //===================
    public static void sortColors(int[] nums) {
        int j=0;
        int co0=0;
        int co1=0;
        int co2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                co0++;
            }
            else if(nums[i]==1){
                co1++;
            }
            else{
                co2++;
            }
        }
        for(int i=0 ; i<co0 ;i++){
            nums[j++]=0;
        }
        for(int i=0 ; i<co1 ;i++){
            nums[j++]=1;
        }
        for(int i=0 ; i<co2 ;i++){
            nums[j++]=2;
        }

    }

    //===================
    // two pointer approach
    //optimized approach and inplace
    //uses National flag algorithm
    //===================

    public static void optSortColors(int[] nums){
        int low = 0;
        int hig = nums.length -1;
        int mid = 0;
        int temp;
        while(mid<=hig){
            if(nums[mid] == 0){
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 2) {
                temp = nums[mid];
                nums[mid] = nums[hig];
                nums[hig] = temp;
                hig--;
            }
            else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {

        int[] num = {1, 0, 2, 1, 0};
        System.out.println(Arrays.toString(num));
        sortColors(num);
        System.out.println(Arrays.toString(num));

        //int[] num1 = {1, 0, 2, 1, 0};
        int[] num1 = {2,0,1};
        optSortColors(num1);
        System.out.println(Arrays.toString(num1));


    }
}
