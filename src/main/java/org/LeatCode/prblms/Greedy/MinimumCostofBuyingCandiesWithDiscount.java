package org.LeatCode.prblms.Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumCostofBuyingCandiesWithDiscount {

    public static int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int sum =0;
        int flag = 1;
        for(int i=cost.length-1 ; i >= 0 ; i--){
            System.out.println("values : "+cost[i]);
            if(flag%3 == 0){
                System.out.println("skipping");
                flag =1;
                continue;
            }
            flag++;
            sum +=cost[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] cost = {10,5,9,4,1,9,10,2,10,8};
        System.out.println(minimumCost(cost));
    }
}
