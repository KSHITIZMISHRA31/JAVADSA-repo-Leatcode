package org.LeatCode.prblms.Math;

import java.util.Arrays;

public class TwoFrthstHouiDffrtClrs {

    public static int maxDistance(int[] colors) {
        System.out.println(Arrays.toString(colors));
        int n = colors.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(colors[i] != colors[n-1]){
                max = Math.max(max,n-1-i);
            }
        }

        for(int i = n-1;i>=0;i--){
            if(colors[i] != colors[0]){
                max = Math.max(max,i);
            }
        }
        if(max == Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] colors = {6,6,6,6,6,6,6,6,6,19,19,6,6};
        System.out.println(maxDistance(colors));
    }

}
