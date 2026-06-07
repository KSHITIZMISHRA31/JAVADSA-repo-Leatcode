package org.LeatCode.prblms.Greedy;

import java.util.ArrayList;

public class FractionalKnapsack {

    public static double fractionalKnapsack(int[] val, int[] wt, long cap) {
        // Your code goes here
        double ans = 0;
        double capcity = (double)cap;
        ArrayList<ArrayList<Double>> res = new ArrayList<>();

        for(int i=0;i<val.length;i++){
            ArrayList<Double> arr = new ArrayList<>();
            arr.add((double)val[i]);
            arr.add((double)wt[i]);
            arr.add((double)val[i]/wt[i]);
            res.add(arr);
        }
        System.out.println(res);
        res.sort((a,b)-> Double.compare(a.get(2), b.get(2)));
        System.out.println(res);
        while (!res.isEmpty() && capcity>0){
            if(res.getLast().get(1)<capcity){
                capcity = capcity-res.getLast().get(1);
                ans +=res.getLast().get(0);
                res.removeLast();
            }
            else{
                ans += res.getLast().get(2)*capcity;
                capcity = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] val = {100,60,100,200}, wt = {20,10,50,50};
        int capacity = 90;
        System.out.println(fractionalKnapsack(val,wt,capacity));
    }
}
