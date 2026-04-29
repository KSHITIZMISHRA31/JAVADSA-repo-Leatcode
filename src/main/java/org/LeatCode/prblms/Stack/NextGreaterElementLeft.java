package org.LeatCode.prblms.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementLeft {

    public static int[] nextGreaterElementLeft(int[] arr){
        int[] rslt = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        Stack<Integer> st = new Stack<>();
        for(int i =0 ;i< arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
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
        System.out.println(Arrays.toString(nextGreaterElementLeft(nums)));

    }
}
