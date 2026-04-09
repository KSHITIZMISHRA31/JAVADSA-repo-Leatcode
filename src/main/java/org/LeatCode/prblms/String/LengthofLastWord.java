package org.LeatCode.prblms.String;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        System.out.println(s);
        int i;
        for(i = s.length()-1;i>-1;i--){
            if(s.charAt(i) != ' '){
                break;
            }
        }
        System.out.println(i);
        int count=0;

        for(int j = i; j>-1;j--){
            if(s.charAt(j) == ' '){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
