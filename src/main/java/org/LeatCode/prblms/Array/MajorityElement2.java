package org.LeatCode.prblms.Array;

import java.util.*;

public class MajorityElement2 {
    //========================
    //Brute force
    // approach is to use 2 for loop then
    //count frequencty of each number if it occurs more hten n/3 times then return those number
    //=======================

    //=======================
    //Better Approach
    // in this we will use hash map to store frequency which take O(n)
    //=======================

    //=======================
    //Optimized approach
    //same approach used in majority elemnt
    //=======================

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> lList = new ArrayList<>();
        System.out.println(Arrays.toString(nums));
        int count1 = 0 , count2 = 0;
        int el1 = 0 , el2= 0;

        for(int i=0; i<nums.length;i++){

            if(count1 == 0 && nums[i] != el2){
                el1 = nums[i];
                count1++;
            }
            else if(count2 == 0 && nums[i] != el1){
                el2 = nums[i];
                count2++;
            }
            else if(el1 == nums[i]){
                count1++;
            }
            else if(el2 == nums[i]) {
                count2++;
            } else{
                count1--;
                count2--;
            }

        }
        System.out.println("el1 "+el1 +" el2 "+el2);
        count1 = 0 ; count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(el1 == nums[i]) count1++;
            else if(el2 == nums[i]) count2++;
        }
        int mini = (nums.length/3);
        if(count1>mini) lList.add(el1);
        if(count2>mini) lList.add(el2);

        Collections.sort(lList);
        return lList;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,1,1,1,2,2,2};
        System.out.println(majorityElement(nums));

    }

}
