package org.LeatCode.prblms.DailyChallg;

import java.util.ArrayList;
import java.util.Arrays;

public class PartitionArrayAccordingtoGivenPivot {
    /// =========================
    /// Brute Force approach
    /// =========================
    public static int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> sml = new ArrayList<>();
        ArrayList<Integer> pivt = new ArrayList<>();
        ArrayList<Integer> lrg = new ArrayList<>();

        for(int i:nums){
            if(i<pivot){
                sml.add(i);
            } else if (i==pivot) {
                pivt.add(i);
            }
            else{
                lrg.add(i);
            }
        }
        int i=0;
        int[] res = new int[nums.length];
        while (!sml.isEmpty()){
            res[i++] = sml.getFirst();
            sml.removeFirst();
        }
        while (!pivt.isEmpty()){
            res[i++] = pivt.getFirst();
            pivt.removeFirst();
        }
        while (!lrg.isEmpty()){
            res[i++] = lrg.getFirst();
            lrg.removeFirst();
        }
        return res;
    }
    /// ============================
    /// Optimized Approach
    /// ============================

    public static int[] optPivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (nums[i] < pivot) {
                result[left++] = nums[i];
            }
            if (nums[j] > pivot) {
                result[right--] = nums[j];
            }
        }

        while (left <= right) {
            result[left++] = pivot;
        }

        return result;
    }




    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));

        System.out.println(Arrays.toString(optPivotArray(nums,pivot)));
    }

}
