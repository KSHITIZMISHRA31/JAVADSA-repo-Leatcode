package org.LeatCode.prblms.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(Character ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>> arr = new ArrayList<>(hm.entrySet());
        arr.sort((a,b)->b.getValue()-a.getValue());
        String st = "";
        for(Map.Entry<Character,Integer> mp: arr ){
            Character c = mp.getKey();
            Integer j = mp.getValue();
            for(int i=0;i<j;i++){
                st = st + c;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
