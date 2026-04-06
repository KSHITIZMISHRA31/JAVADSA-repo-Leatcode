package org.LeatCode.prblms.String;

import java.util.HashMap;

public class RobotReturntoOrigin {

    public static boolean judgeCircle(String moves) {

        int updown = 0;
        int rightleftt = 0;
        if(moves.length()==0) return true;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                updown++;
            } else if (moves.charAt(i)=='D') {
                updown--;
            } else if (moves.charAt(i)=='L') {
                rightleftt++;
            } else{
                rightleftt--;
            }
        }
        System.out.println("Updown - "+updown+" rightleft - "+rightleftt);

        if(updown == 0 && rightleftt == 0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));

    }
}
