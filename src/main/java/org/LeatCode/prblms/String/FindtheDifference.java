package org.LeatCode.prblms.String;

import java.util.ArrayList;
import java.util.Arrays;

public class FindtheDifference {

    /// =====================
    /// Basic Hashing Approach
    /// =====================
    public static char findTheDifference(String s, String t) {
        int[] ch = new int[26];
        int i=0;
        for(;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }
        ch[t.charAt(i)-'a']--;
        for(int j=0;j<26;j++){
            if(ch[j]==-1){
                return (char)('a'+j);
            }
        }
        return 'a';
    }
    /// =========================
    /// Optimized approach
    /// =========================

    public static char optimizedFindTheDifference(String s, String t) {
        int xor =0;
        for(char c: s.toCharArray()){
            xor = xor ^ c;
        }
        for(char c: t.toCharArray()){
            xor = xor ^ c;
        }
        return (char)xor;
    }
    public static void main(String[] args) {
        String s = "abcd", t = "abecd";
        System.out.println(findTheDifference(s,t));
        System.out.println(optimizedFindTheDifference(s,t));
    }
}
