package org.LeatCode.prblms.Math;

public class PowerofTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n == 0){
            return false;
        }
        while(n!=1){
            if(n%2 != 0){
                return false;
            }
            n = (int)n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}
