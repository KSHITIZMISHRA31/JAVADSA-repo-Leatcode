package org.LeatCode.prblms.Stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int a : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                if (st.peek() < -a) {
                    st.pop();
                    continue;
                } else if (st.peek() == -a) {
                    st.pop();
                }
                destroyed = true;
                break;
            }
            if (!destroyed) {
                st.push(a);
            }
        }
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {3,5,-6,2,-1,4};

        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
