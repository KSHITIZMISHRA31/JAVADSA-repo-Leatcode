package org.LeatCode.prblms.Greedy;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0 ,j=0;
        while (i<g.length && j<s.length){
            if(g[i] <= s[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] g = {1,5,3,3,4}, s = {4,2,1,2,1,3};
        System.out.println(findContentChildren(g,s));
    }
}
