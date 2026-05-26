package org.LeatCode.prblms.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class MaximalRectangle {

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

    public static int maximalRectangle(char[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
                if(i==0){
                    if(matrix[i][j] == '1'){
                        arr[i][j] = 1;
                    }
                    else{
                        arr[i][j] = 0;
                    }
                }
                else{
                    if(matrix[i][j] == '1'){
                        arr[i][j] = arr[i-1][j] + 1;
                    }
                    else{
                        arr[i][j] = 0;
                    }

                }
            }
            System.out.println();
        }
        System.out.println("--------------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        int maxarr = 0;
        for(int i=0;i<arr.length;i++){
            System.out.println(largestRectangleArea(arr[i]));
            maxarr = Math.max(maxarr,largestRectangleArea(arr[i]));
        }
        return maxarr;
    }
    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }
}
