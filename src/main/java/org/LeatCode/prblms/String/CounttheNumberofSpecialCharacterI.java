package org.LeatCode.prblms.String;

import java.util.Arrays;

public class CounttheNumberofSpecialCharacterI {
    public static int numberOfSpecialChars(String word) {
        int[] smll = new int[26];
        int[] cptl = new int[26];
        for(char i : word.toCharArray()){
            if(i-'A'<27){
                cptl[i-'A'] = 1;
            }
            else{
                smll[i-'a'] = 1;
            }
        }
        System.out.println(Arrays.toString(cptl));
        System.out.println(Arrays.toString(smll));
        int cont=0;
        for(int i = 0;i<26;i++){
            if(cptl[i] == 1 && smll[i] == 1){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars(word));
    }
}
