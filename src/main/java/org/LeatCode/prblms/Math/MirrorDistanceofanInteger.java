package org.LeatCode.prblms.Math;

public class MirrorDistanceofanInteger {

    public static int reverse(int i){
        int rev = 0;

        while (i>0){
            rev = rev*10 + i % 10;
            i = i/10;
        }
        return rev;
    }

    public static int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(mirrorDistance(n));
    }
}
