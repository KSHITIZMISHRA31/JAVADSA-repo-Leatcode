package org.LeatCode.prblms.Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        for(int i = 0; i<ransomNote.length();i++){
            ransom[ransomNote.charAt(i)-'a']++;
        }
        for(int i = 0; i<magazine.length();i++){
            ransom[magazine.charAt(i)-'a']--;
            if(ransom[magazine.charAt(i)-'a']<0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aabbb";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
