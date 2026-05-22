package org.LeatCode.prblms.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveKDigits {

    public static String removeKdigits(String num, int k) {


        Stack<Character> st = new Stack<>();

        // Edge case
        if (num.length() == k) {
            return "0";
        }

        // Monotonic increasing stack
        for (int i = 0; i < num.length(); i++) {

            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        // If k still remains
        while (k > 0) {
            st.pop();
            k--;
        }

        // Build string from stack
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        // Reverse because stack pops in reverse order
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If empty, return 0
        return sb.length() == 0 ? "0" : sb.toString();
    }


    public static void main(String[] args) {
        String num = "10000200";
        int k = 1;
        System.out.println(removeKdigits(num,k));
    }
}
