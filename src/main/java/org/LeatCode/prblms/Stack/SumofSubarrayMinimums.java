package org.LeatCode.prblms.Stack;

import java.util.Arrays;
import java.util.Stack;

public class SumofSubarrayMinimums {

    public static int[] nextSmallr(int[] arr){
        int[] rslt = new int[arr.length];
        int[] rsltInd = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stInd = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
                stInd.pop();
            }
            if(st.isEmpty()){
                rslt[i] = -1;
                rsltInd[i] = arr.length;
            }
            else{
                rslt[i] = st.peek();
                rsltInd[i] = stInd.peek();
            }
            st.push(arr[i]);
            stInd.push(i);
        }
        System.out.println(Arrays.toString(rslt));
        return rsltInd;
    }
    public static int[] prvsSmallr(int[] arr){
        int[] rslt = new int[arr.length];
        int[] rsltInd = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stInd = new Stack<>();
        for(int i =0;i< arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
                stInd.pop();
            }
            if(st.isEmpty()){
                rslt[i] = -1;
                rsltInd[i] = -1;
            }
            else{
                rslt[i] = st.peek();
                rsltInd[i] = stInd.peek();
            }
            st.push(arr[i]);
            stInd.push(i);
        }
        System.out.println(Arrays.toString(rslt));
        return rsltInd;
    }

    public static int sumSubarrayMins(int[] arr) {
        System.out.println("Input Array : "+Arrays.toString(arr));
        int[] nextSmall = nextSmallr(arr);
        System.out.println("Right Small : "+Arrays.toString(nextSmall));
        int[] prevSmall = prvsSmallr(arr);
        System.out.println("Left Small  : "+Arrays.toString(prevSmall));
        long total = 0;
        int mod = (int)1e9+7;     // 10 power 9 +7 is the limit of an integer so to controll overflow we will use this mod
        for(int i =0 ;i< arr.length;i++){
            System.out.println(prevSmall[i]+"  :  "+arr[i]+"  :  "+nextSmall[i]);
            long left = i - prevSmall[i];
            long rght = nextSmall[i] - i;
            long contrib = (left * rght % mod) * arr[i] % mod;
            total = (total + contrib) % mod;
        }
        return (int)total;
    }

    public static void main(String[] args) {
        int[] arr = {11,81,94,43,3};
        System.out.println(sumSubarrayMins(arr));
    }
}
