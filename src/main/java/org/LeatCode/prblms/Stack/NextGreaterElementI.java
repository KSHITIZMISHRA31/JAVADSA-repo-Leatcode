package org.LeatCode.prblms.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] returnVec = new int[nums1.length];
        Stack<Integer> lStack = new Stack<>();
        ArrayList<Integer> lArrayList = new ArrayList<>();
        for(int i = nums2.length-1 ; i>=0 ; i--){
            while (lStack.size()>0 && lStack.peek() <= nums2[i]) {
                lStack.pop();
            }
            if(lStack.size()==0){
                lArrayList.add(-1);
            }
            else {
                lArrayList.add(lStack.peek());
            }
            lStack.push(nums2[i]);
        }
        HashMap<Integer,Integer> lHashMap = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            lHashMap.put(nums2[i],lArrayList.get(nums2.length-1-i) );
        }
        for(int i=0 ;i<nums1.length;i++){
            returnVec[i]=lHashMap.get(nums1[i]);
        }
        return returnVec;
    }

    public static void main(String[] args) {

        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
