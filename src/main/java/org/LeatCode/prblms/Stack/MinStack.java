package org.LeatCode.prblms.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MinStack {
    static  Stack<ArrayList<Integer>> st = new Stack<>();

    public MinStack() {
    }

    public static void push(int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (st.isEmpty()) {
            arr.add(val);
            arr.add(val);
            st.push(arr);
        } else {
            int currentMin = Math.min(val, st.peek().get(1));
            arr.add(val);
            arr.add(currentMin);
            st.push(arr);
        }
    }

    public static void pop() {
        st.pop();
    }

    public static int top() {
        return st.peek().get(0);

    }

    public static int getMin() {
        return st.peek().get(1);
    }

    public static String[] functioncalling(String[] func,int[][] val){
        String[] returnval = new String[func.length];
        for(int i=0;i<func.length;i++){
            System.out.println(st);
            if(func[i].equals("MinStack")){
                returnval[i] = null;
            }
            if(func[i].equals("push")){
                push(val[i][0]);
                returnval[i] = null;
            }
            if(func[i].equals("getMin")){
                returnval[i] = Integer.toString(getMin());
            }
            if(func[i].equals("pop")){
                pop();
                returnval[i] = null;
            }
            if(func[i].equals("top")){
                returnval[i] = Integer.toString(top());
            }

        }
        return returnval;
    }

    public static void main(String[] args) {

        String[] func = {"MinStack","push","push","push","getMin","pop","top","getMin"};
        int[][] val = {{},{-2},{0},{-3},{},{},{},{}};

        System.out.println(Arrays.toString(functioncalling(func,val)));

    }

}
