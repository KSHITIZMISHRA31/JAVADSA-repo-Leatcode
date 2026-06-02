package org.LeatCode.prblms.String;

import java.util.Arrays;

public class CounttheNumberofSpecialCharactersII {


        public static int numberOfSpecialChars(String word) {
            int[] smll = new int[26];
            int[] cptl = new int[26];
            int count = 0;

            for(int i = 0 ; i < word.length() ; i++){
                System.out.println(word.charAt(i) +" Capital : "+(word.charAt(i) - 'A')+" Smll : "+(word.charAt(i) - 'a')+" pos :"+i);
            }
            System.out.println(Arrays.toString(cptl));
            System.out.println(Arrays.toString(smll));
            return count;
        }

        public static void main(String[] args) {
            String word = "aaAbcBC";
            System.out.println(numberOfSpecialChars(word));
        }
}

