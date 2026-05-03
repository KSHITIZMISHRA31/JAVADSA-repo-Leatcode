package org.LeatCode.prblms.Stack;

import java.util.Arrays;
import java.util.Stack;

public class SumofSubarrayRanges {

    public static int[] nextSmallr(int[] arr){
        int[] rslt = new int[arr.length];
        int[] rsltInd = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stInd = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>arr[i]){
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

    public static int[] nextLarg(int[] arr){
        int[] rslt = new int[arr.length];
        int[] rsltInd = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stInd = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<arr[i]){
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
    public static int[] prvsLarg(int[] arr){
        int[] rslt = new int[arr.length];
        int[] rsltInd = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stInd = new Stack<>();
        for(int i =0;i< arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
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


    public static long sumSubarrayMins(int[] arr) {
        System.out.println("Input Array : "+ Arrays.toString(arr));
        int[] nextSmall = nextSmallr(arr);
        System.out.println("Right Small : "+Arrays.toString(nextSmall));
        int[] prevSmall = prvsSmallr(arr);
        System.out.println("Left Small  : "+Arrays.toString(prevSmall));
        long total = 0;
        for(int i =0 ;i< arr.length;i++){
            long left = i - prevSmall[i];
            long rght = nextSmall[i] - i;
            total = (total + ((left * rght) * arr[i]));
        }
        return total;
    }
    public static long sumSubarrayMax(int[] arr) {
        System.out.println("Input Array : "+ Arrays.toString(arr));
        int[] nextLarge = nextLarg(arr);
        System.out.println("Right Lagest : "+Arrays.toString(nextLarge));
        int[] prevLarge = prvsLarg(arr);
        System.out.println("Left Largest  : "+Arrays.toString(prevLarge));
        long total = 0;
        for(int i =0 ;i< arr.length;i++){
            long left = i - prevLarge[i];
            long rght = nextLarge[i] - i;
            total = (total + ((left * rght) * arr[i]));
        }
        return (int)total;
    }

    public static long subArrayRanges(int[] nums) {
        return (sumSubarrayMax(nums)-sumSubarrayMins(nums));
    }

    public static void main(String[] args) {
        int[] arr = {4,-2,-3,4,1};
        System.out.println(subArrayRanges(arr));
    }
}
