package org.LeatCode.prblms.Greedy;

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int five =0, ten =0;
        for(int i: bills){

            if(i==5){
                five++;
            }
            else if (i==10) {
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else {
                if(ten>0 && five>0){
                    five--;
                    ten--;
                }
                else if(five>2){
                    five-=3;
                }
                else{
                    return false;
                }
            }
            System.out.println(i+" : five : "+five+" : ten : "+ten);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,5,20};
        System.out.println(lemonadeChange(bills));
    }

}
