package org.LeatCode.prblms.Array;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

    //==================
    //Optimized approach
    // we will use same approach like merging of array
    //==================
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med = 0;
        int i = 0, j = 0;
        int len = nums1.length+nums2.length;
        int[] mergedarr = new int[len];
        while (i<nums1.length && j<nums2.length){
            if(i<nums1.length && nums1[i]<nums2[j]){
                mergedarr[i+j] = nums1[i];
                i++;
            }
            else{
                mergedarr[i+j] = nums2[j];
                j++;
            }
        }
        while (i<nums1.length){
            mergedarr[i+j] = nums1[i];
            i++;
        }
        while (j<nums2.length){
            mergedarr[i+j] = nums2[j];
            j++;
        }
        System.out.println(Arrays.toString(mergedarr)+" : "+len);
        if(len % 2 == 0){
            med = mergedarr[len/2];
            med = med + mergedarr[len/2-1];
            med = med/2;

        }
        else{
            med = mergedarr[len/2];
        }

        return med;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

}
