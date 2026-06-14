package org.LeatCode.prblms.DailyChallg;

public class WeightedWordMapping {

    public static String mapWordWeights(String[] words, int[] weights) {

        StringBuilder res = new StringBuilder();
        for(int i = 0;i<words.length;i++){
            int sum = 0;
            for(int j=0;j<words[i].length();j++){
                sum = sum + weights[words[i].charAt(j)-'a'];
            }
            res.append((char)('z'-sum%26));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] words = {"abcd","def","xyz"} ;
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words,weights));
    }
}
