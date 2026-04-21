package org.LeatCode.prblms.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {

    /// =====================
    /// Optimized Approach
    /// in this we ueed
    /// =====================
    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];
        for(int i = nums.length-1; i>=0 ; i--){
            System.out.println(nums[i]);
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }
        System.out.println(st);
        for(int i = nums.length-1; i>=0 ; i--){
            System.out.println(nums[i]);
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() > nums[i]){
                res[i] = st.peek();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }
            st.push(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {2,10,12,1,11};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));

    }
}
