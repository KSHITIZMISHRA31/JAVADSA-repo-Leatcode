package org.LeatCode.prblms.Math;

import java.util.Arrays;
import java.util.Collections;

public class AnglofTrngl {

    public static double[] internalAngles(int[] sides) {
        double[] angles = new double[3];

        if(!(sides[0]+sides[1]>sides[2] && sides[2]+sides[0]>sides[1] && sides[1]+sides[2]>sides[0])){
            return new double[]{};
        }
        int a= sides[0];
        int b = sides[1];
        int c = sides[2];
        angles[0] = Math.toDegrees(Math.acos((double) (a*a + b*b - c*c)/(2*a*b)));
        angles[1] = Math.toDegrees(Math.acos((double) (a*a + c*c - b*b)/(2*a*c)));
        angles[2] = Math.toDegrees(Math.acos((double) (b*b + c*c - a*a)/(2*b*c)));
        Arrays.sort(angles);
        return angles;
    }

    public static void main(String[] args) {
        int[] sides = {3,4,5};
        System.out.println(Arrays.toString(internalAngles(sides)));
    }
}
