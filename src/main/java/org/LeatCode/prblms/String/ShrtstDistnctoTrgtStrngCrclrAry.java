package org.LeatCode.prblms.String;

public class ShrtstDistnctoTrgtStrngCrclrAry {

    //===========================
    //Better Approach
    //===========================
    public static int closestTarget(String[] words, String target, int startIndex) {

        int nrstRght = Integer.MAX_VALUE;
        int nrstLft = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0 ;i<words.length;i++){
            if(words[(i+startIndex)%words.length].equals(target)){
                nrstRght = Math.min(count,nrstRght);
            }
            count++;
        }
        if(nrstRght == Integer.MAX_VALUE){
            return -1;
        }
        count = 0;
        for(int i = words.length ;i>-1;i--){
            if(words[(i+startIndex)%words.length].equals(target)){
                nrstLft = Math.min(count,nrstLft);
            }
            count++;
        }

        return Math.min(nrstLft,nrstRght);
    }

    public static void main(String[] args) {
        String[] words = {"hello","i","am","leetcode","hello"};
        String target = "hello";
        int startIndex = 1;

        System.out.println(closestTarget(words,target,startIndex));
    }
}
