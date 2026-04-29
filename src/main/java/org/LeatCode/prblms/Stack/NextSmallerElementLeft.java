package org.LeatCode.prblms.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElementLeft {
    public static int[] nextSmallerElementLeft(int[] arr){
        int[] rslt = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        Stack<Integer> st = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                rslt[i] = -1;
            }
            else{
                rslt[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(st);

        return rslt;
    }



    public static void main(String[] args) {
        int[] nums = {2,10,12,1,11};
        System.out.println(Arrays.toString(nextSmallerElementLeft(nums)));

    }
}
