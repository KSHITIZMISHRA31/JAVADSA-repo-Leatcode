package org.LeatCode.prblms.Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> st = new ArrayList<>();
        for(int i=0;i<n;i++){
            int j = i+1;
            if(j%3==0 && j%5==0){
                st.add("FizzBuzz");
            }
            else if(j%3==0){
                st.add("Fizz");
            }
            else if(j%5==0){
                st.add("Buzz");
            }
            else{
                st.add(Integer.toString(i));
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println(fizzBuzz(n));
    }
}
