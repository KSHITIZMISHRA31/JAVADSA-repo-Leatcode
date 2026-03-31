package org.LeatCode.prblms.Array;

import java.util.Arrays;

public class StockBuySell {

    //=====================
    //Optimized approah
    //in this we will assume that we sell and buy on every day
    //
    //=====================
    public static int maxProfit(int[] prices) {
        System.out.println(Arrays.toString(prices));
        int mini = prices[0];
        int prfit = 0;
        int cost = 0;
        for(int i=1;i<prices.length;i++){
            cost = prices[i]-mini;
            prfit = Math.max(cost,prfit);
            mini = Math.min(mini,prices[i]);
        }

        return prfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
