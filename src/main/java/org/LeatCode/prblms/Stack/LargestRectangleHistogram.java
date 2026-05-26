package org.LeatCode.prblms.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleHistogram {

    public static int[] nextSmallest(int[] heights){
        Stack<ArrayList<Integer>> st = new Stack<>();
        int[] res = new int[heights.length];
        for (int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek().get(0)>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = heights.length;
            }
            else{
                res[i] = st.peek().get(1);
            }
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(heights[i]);
            arr.add(i);
            st.push(arr);
        }
        return res;
    }
    public static int[] prvsSmallest(int[] heights){
        Stack<ArrayList<Integer>> st = new Stack<>();
        int[] res = new int[heights.length];
        for (int i=0;i<heights.length;i++){
            while(!st.isEmpty() && st.peek().get(0)>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek().get(1);
            }
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(heights[i]);
            arr.add(i);
            st.push(arr);
        }
        return res;
    }

    public static int largestRectangleArea(int[] heights) {
        int[] ns = nextSmallest(heights);
        int[] ps = prvsSmallest(heights);
        int area = 0;
        for(int i=0 ; i < heights.length ; i++){
            area = Math.max(area,heights[i]*(ns[i]-ps[i]-1));
        }
        return area;
    }

    public static void main(String[] args) {
        int[] heights = {2,4};
        System.out.println(largestRectangleArea(heights));
    }
}
