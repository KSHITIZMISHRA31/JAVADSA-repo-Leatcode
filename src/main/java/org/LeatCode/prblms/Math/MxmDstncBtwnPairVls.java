package org.LeatCode.prblms.Math;

public class MxmDstncBtwnPairVls {

    /// ======================
    /// Better Approach
    /// as 2 for loops were uses O(m+n)
    /// ======================

    public static int maxDistance(int[] nums1, int[] nums2) {

        int maxdist = Integer.MIN_VALUE;

        for (int i = nums1.length-1 ; i>=0;i--){
            System.out.print(nums1[i]);
            for(int j = nums2.length-1; j>= i ; j--){
                System.out.print("-->"+nums2[j]);
                if(nums1[i]<= nums2[j]){
                    System.out.print(" ("+ i+","+j+") ");
                    maxdist = Math.max(maxdist, Math.abs(i-j));
                }

            }
            System.out.println();
        }
        if(maxdist == Integer.MIN_VALUE){
            return 0;
        }
        return maxdist;
    }

    /// ======================
    /// Optimized approach
    /// Two pointer
    /// ======================

    public static int optMaxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int maxDist = 0;

            while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                maxDist = Math.max(maxDist, j - i);
                j++; // try to expand distance
            } else {
                i++; // move i to satisfy condition
            }
        }

            return maxDist;
    }

    public static void main(String[] args) {
        int[] nums1 = {55,30,5,4,2};
        int[] nums2 = {100,20,10,10,5};
        System.out.println(maxDistance(nums1,nums2));
        System.out.println(optMaxDistance(nums1,nums2));
    }
}
