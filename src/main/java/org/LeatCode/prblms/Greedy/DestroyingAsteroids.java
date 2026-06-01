package org.LeatCode.prblms.Greedy;

import java.util.Arrays;

public class DestroyingAsteroids {

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curmass = mass;
        for(int i: asteroids){
            if(curmass<i){
                return false;
            }
            curmass += i;
        }
        return true;
    }

    public static void main(String[] args) {
        int mass = 5;
        int[] asteroids = {4,9,23,4};
        System.out.println(asteroidsDestroyed(mass,asteroids));
    }

}
