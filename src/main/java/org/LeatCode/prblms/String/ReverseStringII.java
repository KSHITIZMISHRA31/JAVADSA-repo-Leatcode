package org.LeatCode.prblms.String;

public class ReverseStringII {

    //==================
    //Better/ Brute Force Approach
    //==================

    public static String reverseStr(String s, int k) {
        String revString ="";
        int strLen = s.length();
        StringBuilder tempStr;
        int i=0;
        while (strLen>i){
            int j = 0;
            tempStr = new StringBuilder();
            while( s.length()>i+j && k>j){
                tempStr.append(s.charAt(j+i));
                j++;
            }
            tempStr.reverse();
            j=0;
            while( s.length()>i+j && k>j){
                revString = revString + tempStr.charAt(j);
                j++;
            }
            while (s.length()>i+j && 2*k>j){
                revString = revString + s.charAt(i+j);
                j++;
            }
            i = i+k*2;
        }
        return revString;
    }

    //==================
    //Optimized approach
    //==================
    public static String optreverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            // reverse from left to right
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }


    public static void main(String[] args) {

        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,k));
        System.out.println(optreverseStr(s,k));
    }
}
