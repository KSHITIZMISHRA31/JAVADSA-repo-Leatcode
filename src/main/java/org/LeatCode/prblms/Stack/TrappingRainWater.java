package org.LeatCode.prblms.Stack;

import java.util.Arrays;

public class TrappingRainWater {


    /// ======================
    /// Optimized approach
    /// In this we have to find prefixsum and suffixsum approach
    /// ======================

    public static int trap(int[] height) {
        int total = 0;
        System.out.println(Arrays.toString(height));
        int len = height.length;
        int[] prfxmx = new int[len];
        int[] sufxmx = new int[len];

        prfxmx[0] = height[0];
        for(int i=1; i<len ; i++){
            prfxmx[i] = Math.max(prfxmx[i-1],height[i]);
        }
        System.out.println(Arrays.toString(prfxmx));

        sufxmx[len-1] = height[len-1];
        for(int i = len-2;i>=0;i--){
            sufxmx[i] = Math.max(sufxmx[i+1],height[i]);
        }
        System.out.println(Arrays.toString(sufxmx));

        for(int i=0;i<len;i++){
            if(height[i]<prfxmx[i] && height[i]<sufxmx[i]){
                total = total + Math.min(prfxmx[i],sufxmx[i]) - height[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {

        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));

    }
}
