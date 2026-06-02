package org.LeatCode.prblms.Greedy;

public class EarliestFinishTimeforLandandWaterRides {

    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landThenWater = solve(landStartTime, landDuration, waterStartTime, waterDuration);
        int waterThenLand = solve(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(landThenWater, waterThenLand);
    }

        private static int solve(int[] firstStart, int[] firstDuration, int[] secondStart, int[] secondDuration) {

            int minFinish = Integer.MAX_VALUE;

            // Earliest possible finish time of the first ride type
            for (int i = 0; i < firstStart.length; i++) {
                minFinish = Math.min(minFinish, firstStart[i] + firstDuration[i]);
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < secondStart.length; i++) {
                ans = Math.min(ans, Math.max(secondStart[i], minFinish) + secondDuration[i]
                );
            }
            return ans;
        }



    public static void main(String[] args) {
        int[] landStartTime = {2,8}, landDuration = {4,1}, waterStartTime = {6}, waterDuration = {3};
        System.out.println(earliestFinishTime(landStartTime,landDuration,waterStartTime,waterDuration));
    }
}
