package org.LeatCode.prblms.String;

public class FindtheIndexFirstOccurrenceString {

    public static int strStr(String haystack, String needle) {

        if(needle.length()>haystack.length()){
            return -1;
        }
        int i = 0;
        while(i<haystack.length()){
            int j=0;
            int flag=0;
            System.out.println(haystack.charAt(i)+" : "+needle.charAt(j)+" : "+i);
            while(needle.length()>j && haystack.length()>i+j && haystack.charAt(i+j)==needle.charAt(j)){
                flag++;
                if(flag==needle.length()){
                    return i;
                }
                j++;
            }
            i++;
        }
        return -1;
    }



    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        System.out.println(strStr(haystack,needle));
        System.out.println(haystack.indexOf(needle));
    }
}
