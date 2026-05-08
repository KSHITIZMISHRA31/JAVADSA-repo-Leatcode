package org.LeatCode.prblms.String;

public class ReverseString {

    public static void reverseString(char[] s) {
        System.out.println(s);
        int a = 0;
        int b =s.length-1;
        char temp;
        while(a<=b){
            temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}
