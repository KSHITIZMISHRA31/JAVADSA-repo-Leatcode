package org.LeatCode.prblms.Array;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

    //======================
    // Brute force
    /*approach includes 2 for loop in which we take each element and count its frequecy
    if is more then len/2 then thats our answer
    we can also sort the whole array and find the middle number that must be the majority element
    */
    //======================

    //======================
    // Better approach
    /*
    In this approach we are creating hashmap
     */
    //======================
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
           if(!hm.containsKey(nums[i])){
               hm.put(nums[i],1);
           }
           else{
               hm.replace(nums[i],hm.get(nums[i])+1);
           }
        }
        for(int i : hm.keySet()){
            if(hm.get(i) > nums.length/2){
                return i;
            }
        }
        return 0;
    }

    //======================
    // Optimized Approach
    // we applied moore's algorithm
    // in this we will start if count is 0 then take that element as majority element and add its count if its value
    // become zero then select another number as majotity
    //If an element occurs more than half the time,
    // its occurrences cannot be entirely canceled out by the occurrences of all other elements combined
    //======================
    private static int optmajorityElement(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int count = 0;
        int el = 0;

        for(int i=0; i<nums.length;i++){
            if(count == 0){
                el = nums[i];
            }
            if(el == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        System.out.println(optmajorityElement(nums));

    }
}
