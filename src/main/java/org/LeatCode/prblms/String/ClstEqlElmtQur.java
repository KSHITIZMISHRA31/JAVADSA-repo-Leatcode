package org.LeatCode.prblms.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClstEqlElmtQur {


    public static int closestVal(int[] words, int target, int startIndex) {
        int n = words.length;
        for (int step = 1; step < n; step++) {  // start from 1, not 0
            int rightIndex = (startIndex + step) % n;
            int leftIndex = (startIndex - step + n) % n;

            if (words[rightIndex] == target || words[leftIndex] == target) {
                return step;
            }
        }
        return -1;
    }

    public static List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> lList = new ArrayList<>();
        for(int i = 0;i<queries.length;i++){
            lList.add(closestVal(nums,nums[queries[i]],queries[i]));
        }
        return lList;
    }

    public static void main(String[] args) {

        int[] nums =
                {1,3,1,4,1,3,2};
        int[] queries = {0,3,5};
        System.out.println(solveQueries(nums,queries));
    }
}
